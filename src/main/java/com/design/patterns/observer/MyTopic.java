package com.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
    private final List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Null Observer");
        }
        synchronized (MUTEX) {
            if (!observers.contains(observer)) {
                observers.add(observer);
            }
        }
    }
    @Override
    public void unregister(Observer observer) {
        synchronized (MUTEX) {
            observers.remove(observer);
        }
    }
    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;
        // synchronization is used to ensure that any new subscriber that
        // subscribers while the notification is being processed and this
        // is created within a synchronized block to prevent any race conditions
        synchronized (MUTEX) {
            if (!changed) {
                return;
            }
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer obj : observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    // method to post message to the topic
    @Override
    public void postMessage(String msg) {
        System.out.println("Message posted to the topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
