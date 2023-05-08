package com.design.patterns.builder;

import com.design.patterns.builder.engine.SUVEngine;
import com.design.patterns.builder.engine.SportsEngine;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SUVEngine());
        builder.setTrip(true);
        builder.setGPS(true);
    }
    public void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportsEngine());
        builder.setTrip(true);
        builder.setGPS(true);
    }
}
