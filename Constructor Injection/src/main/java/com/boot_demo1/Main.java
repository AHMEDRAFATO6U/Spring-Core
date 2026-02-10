package com.boot_demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.boot_demo1");

        UserService userService = (UserService) context.getBean("userService");
        userService.registerUser();

        System.out.println("Hello, World!");
    }
}