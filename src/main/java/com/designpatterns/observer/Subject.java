package com.designpatterns.observer;
// https://www.digitalocean.com/community/tutorials/observer-design-pattern-in-java
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    // method to notify observers of change
    void notifyObservers();
    // method to get updates from subject
    Object getUpdate(Observer observer);
    void postMessage(String message);
}
