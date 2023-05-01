package com.designpatterns.COR;

public class Dollar20Dispenser implements DispenseChain{
    private DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20) {
            int numberOfNotes = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing " + numberOfNotes + " $20 notes >>>>>");
            if (remainder != 0) {
                this.dispenseChain.dispense(new Currency(remainder));
            } else {
                this.dispenseChain.dispense(currency);
            }
        }
    }
}
