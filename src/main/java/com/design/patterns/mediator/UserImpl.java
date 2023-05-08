package com.design.patterns.mediator;

public class UserImpl extends User {
    public UserImpl(String name, ChatMediator mediator) {
        super(name, mediator);
    }
    @Override
    public void send(String message) {
        System.out.println(this.name + " :: Sending message =" + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " :: Receiving message =" + message);
    }
}
