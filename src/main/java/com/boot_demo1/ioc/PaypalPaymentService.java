package com.boot_demo1.ioc;

import org.springframework.stereotype.Component;

@Component
public class PaypalPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Paypal Payment Service");


    }
}
