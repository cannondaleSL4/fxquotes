package com;

import com.webconfig.CustomSuccessHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by dima on 21.01.18.
 */
@SpringBootApplication
public class IdentityApplication {
    public static void main(String[] args) {
        SpringApplication.run(IdentityApplication.class, args);
    }

    @Bean
    public CustomSuccessHandler getCustomSuccessHandler(){
        return new CustomSuccessHandler();
    }
}