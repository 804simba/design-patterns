package com.design.patterns.builder.engine;

public class SportsEngine implements Engine {
    @Override
    public void start() {
        System.out.println("SportsEngine started...");
    }

    @Override
    public void stop() {
        System.out.println("SportsEngine stopped...");
    }
}
