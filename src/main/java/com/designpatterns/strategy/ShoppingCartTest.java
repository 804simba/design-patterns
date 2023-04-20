package com.designpatterns.strategy;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        // pay by PayPal
        cart.pay(new PaypalStrategy("simba", "1234"));

        // pay by creditCard
        cart.pay(new CreditCardStrategy("BOA", "1234567", "223", "23-9-2023"));
    }
}
