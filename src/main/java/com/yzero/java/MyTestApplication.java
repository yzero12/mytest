package com.yzero.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MyTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyTestApplication.class, args);
    }

}
