package com.design.patterns.mediator;

import lombok.Data;

@Data
public abstract class User {
    // users can send and receive messages
    protected String name;
    // this reference to the mediator object is required for communication
    // between different users.
    protected ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    public abstract void send(String message);
    public abstract void receive(String message);
}
