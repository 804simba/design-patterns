package com.design.patterns.observer;

public interface Observer {
    // method to update the observer, used by subject
    void update();
    // used to set the Subject to be observed for state changes
    void setSubject(Subject subject);
}
