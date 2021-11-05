package com.rapidpay.ceb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EntityScan("com.rapidpay.ceb.model")
@ComponentScan("com.rapidpay.ceb.controller")
@ComponentScan("com.rapidpay.ceb.service")
@ComponentScan("com.rapidpay.ceb.repo")
@EnableMongoRepositories("com.rapidpay.ceb.repo.custom")
public class StartUp {

    public static void main(String[] args) {
        SpringApplication.run(StartUp.class, args);
    }

}
