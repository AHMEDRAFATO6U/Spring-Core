package com.boot_demo1;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements NotificationService{

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification " + message);

    }
}
