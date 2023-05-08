package com.design.patterns.COR;

// methods to define the next handler or processor and process the request.
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
