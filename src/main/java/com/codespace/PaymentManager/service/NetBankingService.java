package com.codespace.PaymentManager.service;

import org.springframework.stereotype.Service;

@Service("netBanking")   
public class NetBankingService implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking");
    }
}