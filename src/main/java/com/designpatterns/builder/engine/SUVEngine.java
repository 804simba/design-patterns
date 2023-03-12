package com.designpatterns.builder.engine;

public class SUVEngine implements Engine {
    @Override
    public void start() {
        System.out.println("SUV engine started..");
    }

    @Override
    public void stop() {
        System.out.println("SUV engine stopped..");
    }
}
