package com.design.patterns.strategy;

/**
 * Strategy design pattern is one of the behavioural design patterns
 * which is used when we have multiple algorithms for a specific task
 * and clients decide which of the actual implementations is to be used
 * at runtime by passing the algorithm as a parameter.
 * */
public interface PaymentStrategy {
    // https://www.digitalocean.com/community/tutorials/strategy-design-pattern-in-java-example-tutorial
    void makePayment(double amount);
}
