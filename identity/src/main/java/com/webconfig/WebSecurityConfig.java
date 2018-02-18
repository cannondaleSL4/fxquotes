package com.webconfig;

import com.model.user.User;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

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
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        List<User> userList = userRepository.findAll();

        userList.forEach(K ->{
            try {
                auth.inMemoryAuthentication()
                        .withUser(K.getEmail()).password(K.getPassword()).roles(K.getRoles().stream().collect(Collectors.toList()).get(0).toString().toUpperCase());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/ADMIN/**").access("hasRole('ADMIN')")
                .antMatchers("/user/**").access("hasRole('USER')")
                .and().formLogin().loginPage("/login").successHandler(customSuccessHandler)
                .usernameParameter("inputEmail").passwordParameter("inputPassword")
                .and().csrf()
                .and().exceptionHandling().accessDeniedPage("/Access_Denied");

        http.authorizeRequests().antMatchers("/").permitAll().and()
                .authorizeRequests().antMatchers("/console/**").permitAll();

        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}
