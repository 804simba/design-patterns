package com.design.patterns.COR;

import java.util.Scanner;

/**
 * Chain of responsibility design pattern is a behavioural design pattern that lets you pass requests along a chain of
 * handlers. Upon receiving a request, each handler decides whether to process that request of pass it to the next handler
 * in the chain. Like many other behavioural design patterns, the chain of Responsibility relies on transforming particular
 * behaviour into stand-alone objects called handlers. It is used to achieve loose-coupling in software design.
 *
 * CoR passes a request sequentially along a dynamic chain of potential receivers until one of them handles it.
 *
 * For example in an authentication system, where you want to perform a series of checks before granting users access to
 * resources, you can extract each check into a separate class, with a single method that performs the check. The request
 * along with its data is passed to this method as an argument.
 *
 * This pattern suggests that you link these handlers into a chain, with each linked handler having a field for storing
 * a reference to the next handler in the chain. This request travels along the chain until all handlers have had a chance to
 * process it. A handler can also decide not to pass the request further down the chain and effectivly stop any further processing.
 *
 * */
public class ATMDispenseChain {
    // https://www.digitalocean.com/community/tutorials/chain-of-responsibility-design-pattern-in-java
    private DispenseChain dispenseChain1;

    public ATMDispenseChain() {
        // initialiaze the chains
        this.dispenseChain1 = new Dollar50Dispenser();
        DispenseChain dispenseChain2 = new Dollar20Dispenser();
        DispenseChain dispenseChain3 = new Dollar10Dispenser();

        // set the chain of responsibility
        dispenseChain1.setNextChain(dispenseChain2);
        dispenseChain2.setNextChain(dispenseChain3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
        while (true) {
            int amount;
            System.out.println("Enter amount to dispense::::: >>>>>");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount must be in multiples of 10s");
                return;
            }
            // process the request
            atmDispenseChain.dispenseChain1
                    .dispense(new Currency(amount));
        }
    }
}
