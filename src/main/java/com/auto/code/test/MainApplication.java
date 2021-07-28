package com.auto.code.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.auto.code", "com.auto.code.test"})
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);

    }
}
