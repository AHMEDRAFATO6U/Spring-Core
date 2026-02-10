package com.boot_demo1;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    private final NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser() {
        notificationService.sendNotification("User Registered");
    }
}
