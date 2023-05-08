package com.design.patterns.strategy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreditCardStrategy implements PaymentStrategy {
    private final String name;
    private final String cardNumber;
    private final String cvv;
    private final String dateOfExpiry;
    @Override
    public void makePayment(double amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}
