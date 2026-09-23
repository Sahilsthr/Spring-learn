package com.springlearn.demo;

import org.springframework.stereotype.Service;

@Service 
public class orderService {

    private final paymentService paymentService;

    public orderService(paymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
        paymentService.pay();
    }
}
