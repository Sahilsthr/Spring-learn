package com.springlearn.demo;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service 
public class paymentService {

    
    public void pay(){
        System.out.println("Payment done successfully!");
        
    }
    @PostConstruct 
    public void init(){
        System.out.println("Payment Service Bean Constructed!");
    }

    @PreDestroy 
    public void Destroy(){
        System.out.println("Payment service Bean Destoyed!");
    }

    
}
