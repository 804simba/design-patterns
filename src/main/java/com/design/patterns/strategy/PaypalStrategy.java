package com.design.patterns.strategy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaypalStrategy implements PaymentStrategy {
    private final String email;
    private final String password;
    @Override
    public void makePayment(double amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
