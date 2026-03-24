package com.codespace.PaymentManager.controller;

import com.codespace.PaymentManager.PaymentManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentManager manager;

    public PaymentController(PaymentManager manager) {
        this.manager = manager;
    }

    @GetMapping("/pay")
    public String pay() {
        manager.makePayment();
        return "Payment Done!";
    }
}