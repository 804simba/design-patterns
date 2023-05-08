package com.design.patterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }
    public void addItem(Item item) {
        this.items.add(item);
    }
    public void removeItem(Item item) {
        this.items.remove(item);
    }
    public double calculateTotal() {
        double totalPriceOfItems = 0.0;
        for (Item item : items) {
            totalPriceOfItems += item.getPrice();
        }
        return totalPriceOfItems;
    }
    public void pay(PaymentStrategy paymentMethod) {
        double amount = calculateTotal();
        paymentMethod.makePayment(amount);
    }
}
