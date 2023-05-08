package com.design.patterns.brigde;

import com.design.patterns.brigde.impl.PaymentMethodImplementor;

public class CreditCardPayment extends PaymentMethod{
    public CreditCardPayment(PaymentMethodImplementor paymentMethodImplementor) {
        super(paymentMethodImplementor);
    }

    @Override
    public void processPayment(double amount) {
        paymentMethodImplementor.initiatePayment(amount);
        boolean paymentVerified =
                paymentMethodImplementor.verifyPayment();
        if (paymentVerified) {
            // complete the payment
        } else {
            paymentMethodImplementor.cancelPayment();
        }
    }
}
