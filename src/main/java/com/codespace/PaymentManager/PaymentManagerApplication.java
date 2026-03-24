package com.codespace.PaymentManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PaymentManagerApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(PaymentManagerApplication.class, args);

        PaymentManager manager = context.getBean(PaymentManager.class);
        manager.makePayment();
    }
}