package com.example.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloWorldApplication.class, args);
    }

}
