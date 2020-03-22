package com.example.eureka3001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class Eureka3001Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka3001Application.class, args);
    }

}
