package com.webconfig;

import com.controller.UserService;
import com.identity.TokenUtil;
import com.model.user.User;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;
import java.util.stream.Collectors;

/*
 * Created by  dima on 29.12.17.
 */
@Configuration
@EnableWebSecurity
@Order(1000)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private CustomSuccessHandler customSuccessHandler;

    @Autowired
    UserService userService;

    @Autowired
    private TokenUtil tokenUtil;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
        List<User> userList = userRepository.findAll();
        userList.stream().forEach(u -> setAuthority(auth, u));
    }

    private void setAuthority(AuthenticationManagerBuilder auth,User user){
        try {
            auth.inMemoryAuthentication()
                    .withUser(user.getEmail())
                    .password(user.getPassword())
                    .authorities(user.getRoles().stream().collect(Collectors.toList()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void configure(WebSecurity web) throws Exception{
        // Filters will not get executed for the resources
        web.ignoring().antMatchers("/",
                "/resources/**",
                "/static/**",
                "/public/**",
                "/webui/**",
                "/h2/**",
                "/configuration/**",
                "/swagger-ui/**",
                "/swagger-resources/**",
                "/api-docs",
                "/api-docs/**",
                "/v2/api-docs/**",
                "/*.html",
                "/**/*.html" ,
                "/**/*.css",
                "/**/*.js",
                "/**/*.png",
                "/**/*.jpg",
                "/**/*.gif",
                "/**/*.svg",
                "/**/*.ico",
                "/**/*.ttf",
                "/**/*.woff",
                "/**/*.otf");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .exceptionHandling().and()
            .anonymous().and()
            // Disable Cross site references
            .csrf().disable()
            // Add CORS Filter
            .addFilterBefore(new CorsFilter(), ChannelProcessingFilter.class)
            // Custom Token based authentication based on the header previously given to the client
            .addFilterBefore(new VerifyTokenFilter(tokenUtil), UsernamePasswordAuthenticationFilter.class)
            // custom JSON based authentication by POST of {"username":"<name>","password":"<password>"} which sets the token header upon authentication
            .addFilterBefore(new GenerateTokenForUserFilter ("/session", authenticationManager(), tokenUtil), UsernamePasswordAuthenticationFilter.class)
            .authorizeRequests()
            .anyRequest().authenticated()
        ;
    }
}
