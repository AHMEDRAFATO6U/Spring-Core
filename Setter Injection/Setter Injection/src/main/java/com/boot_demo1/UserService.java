package com.boot_demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private  EmailService emailService;
    @Autowired
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendEmail(String to, String subject, String text) {
        emailService.sendEmail();
    }


}
