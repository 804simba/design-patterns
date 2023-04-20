package com.designpatterns.brigde;

import com.designpatterns.brigde.impl.PaymentMethodImplementor;

public class BankTransferPaymentImplementor implements PaymentMethodImplementor {
    @Override
    public void initiatePayment(double amount) {
        // initiate payment
    }

    @Override
    public boolean verifyPayment() {
        // verify payment
        return false;
    }

    @Override
    public void cancelPayment() {
        // cancel payment
    }
}
