package com.codespace.PaymentManager.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Primary   //Default bean
public class UPIService implements PaymentService {

    @PostConstruct
    public void init(){
        System.out.println("UPI Service initialized");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("UPI Service destroyed");
    }
    

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}