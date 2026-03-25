package com.codespace.PaymentManager;

import com.codespace.PaymentManager.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.codespace.PaymentManager.service.CardsService;

@Component
public class PaymentManager {

    @Autowired
    private PaymentService paymentService;
    @Autowired
    private CardsService cardsService;

    //Injecting specific bean using QUALIFIER
    @Autowired
    @Qualifier("netBanking")
    private PaymentService netBankingService;

    //Using value from properties
    @Value("${payment.amount}")
    private double amount;

    public void makePayment() {
        System.out.println("Default Payment (Primary - UPI)");
        paymentService.pay(amount);

        System.out.println("Net Banking Payment");
        netBankingService.pay(amount);

        System.out.println("Card Payment");
        cardsService.pay(amount);
    }
}