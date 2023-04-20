package com.designpatterns.brigde.impl;

public class PayPalPaymentImplementor implements PaymentMethodImplementor {
    @Override
    public void initiatePayment(double amount) {

    }

    @Override
    public boolean verifyPayment() {
        return false;
    }

    @Override
    public void cancelPayment() {

    }
}
