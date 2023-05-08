package com.design.patterns.brigde;

import com.design.patterns.brigde.impl.PaymentMethodImplementor;

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
