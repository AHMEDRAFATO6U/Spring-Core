package com.boot_demo1.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {
        SpringApplication.run(IocApplication.class, args);
        System.out.println("Hello in Ioc Application");

        ApplicationContext context = SpringApplication.run(IocApplication.class, args);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.pay();



    }

}
