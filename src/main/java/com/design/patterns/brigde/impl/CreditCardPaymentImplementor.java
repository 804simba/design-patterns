package com.design.patterns.brigde.impl;

public class CreditCardPaymentImplementor implements PaymentMethodImplementor {
    @Override
    public void initiatePayment(double amount) {
        // implementation for initiating credit card payment
    }

    @Override
    public boolean verifyPayment() {
        // implementation for verifying payment
        return false;
    }

    @Override
    public void cancelPayment() {
        // implementation for cancelling payment
    }
}
