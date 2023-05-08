package com.design.patterns.COR;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Currency {
    // this class stores the amount to be dispensed by the chain implementations.
    private int amount;
}
