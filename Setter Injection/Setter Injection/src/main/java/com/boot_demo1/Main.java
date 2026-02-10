package com.boot_demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ApplicationContext context = new AnnotationConfigApplicationContext("com.boot_demo1");

        UserService userService = context.getBean(UserService.class);
        userService.sendEmail("AhmedRaft@gmail.com" ,"Software Engineer jop","Accepted");
    }
}