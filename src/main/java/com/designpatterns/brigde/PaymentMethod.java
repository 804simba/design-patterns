package com.designpatterns.brigde;

import com.designpatterns.brigde.impl.PaymentMethodImplementor;

public abstract class PaymentMethod {
    protected PaymentMethodImplementor paymentMethodImplementor;

    public PaymentMethod(PaymentMethodImplementor paymentMethodImplementor) {
        this.paymentMethodImplementor = paymentMethodImplementor;
    }
    public abstract void processPayment(double amount);
}
