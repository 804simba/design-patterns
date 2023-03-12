package com.designpatterns.builder.manual;

import com.designpatterns.builder.engine.Engine;

public class Manual {
    private int seats;
    private Engine engine;
    private boolean GPS;
    private boolean trip;
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public void setTrip(boolean trip) {
        this.trip = trip;
    }
}
