package com.boot_demo1.ioc;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void pay() {
        paymentService.pay();
    }
}
