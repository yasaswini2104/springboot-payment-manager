package com.codespace.PaymentManager.service;

import org.springframework.stereotype.Service;

@Service
public class CardsService implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}