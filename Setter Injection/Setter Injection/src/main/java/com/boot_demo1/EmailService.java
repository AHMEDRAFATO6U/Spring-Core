package com.boot_demo1;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
    public void sendEmail() {
        System.out.println("Email Service is running");
    }
}
