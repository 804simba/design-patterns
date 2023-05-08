package com.design.patterns.brigde;

import com.design.patterns.brigde.impl.PaymentMethodImplementor;

public class PayPalPayment extends PaymentMethod {
    public PayPalPayment(PaymentMethodImplementor paymentMethodImplementor) {
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
