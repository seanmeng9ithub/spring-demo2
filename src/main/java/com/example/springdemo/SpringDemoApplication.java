package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.*;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        System.out.println("Start");
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
