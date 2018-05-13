package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by dima on 07.05.18.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PersistApplications {
    public static void main(String[] args) {
        SpringApplication.run(PersistApplications.class, args) ;
    }
}

