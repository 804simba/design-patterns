package com.designpatterns.brigde.impl;

public interface PaymentMethodImplementor {
    void initiatePayment(double amount);
    boolean verifyPayment();
    void cancelPayment();
}
