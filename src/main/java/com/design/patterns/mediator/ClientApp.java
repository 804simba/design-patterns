package com.design.patterns.mediator;

public class ClientApp {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User tim = new UserImpl("Tim", chatMediator);
        User harry = new UserImpl("Harry", chatMediator);
        User ken = new UserImpl("Ken", chatMediator);
        User hannah = new UserImpl("Hannah", chatMediator);

        chatMediator.addUser(tim);
        chatMediator.addUser(hannah);
        chatMediator.addUser(ken);
        chatMediator.addUser(harry);

        tim.send("Hello guys");
    }
}
