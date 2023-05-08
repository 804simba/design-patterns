package com.design.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Mediator is a behavioural design pattern that eliminates direct connections between senders and receivers, rather it forces them to
 * communicate through a mediator object. It helps reduces chaotic dependencies between objects.
 *
 * */

public class ChatMediatorImpl implements ChatMediator {
    private final List<User> users;
    // https://refactoring.guru/design-patterns/mediator

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users){
            if (!u.equals(user)) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
