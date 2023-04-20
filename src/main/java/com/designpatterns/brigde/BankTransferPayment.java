package com.designpatterns.brigde;

import com.designpatterns.brigde.impl.PaymentMethodImplementor;

public class BankTransferPayment extends PaymentMethod{
    public BankTransferPayment(PaymentMethodImplementor paymentMethodImplementor) {
        super(paymentMethodImplementor);
    }

    @Override
    public void processPayment(double amount) {
        paymentMethodImplementor.initiatePayment(amount);
        boolean verifyPayment =
                paymentMethodImplementor.verifyPayment();
        if (verifyPayment) {
            // complete the payment
        } else {
            paymentMethodImplementor.cancelPayment();
        }
    }
}
