package com.designpatterns.COR;

public class Dollar10Dispenser implements DispenseChain{
    private DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int numberOfNotes = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing " + numberOfNotes + " $10 notes >>>>>");
            if (remainder != 0) {
                this.dispenseChain.dispense(new Currency(remainder));
            } else {
                try {
                    this.dispenseChain.dispense(currency);
                } catch (NullPointerException e) {
                    System.out.println("Successful...");
                }
            }
        }
    }
}
