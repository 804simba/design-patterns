package com.designpatterns.builder.car;

import com.designpatterns.builder.Builder;
import com.designpatterns.builder.engine.Engine;

public class CarBuilder implements Builder {
    private Car car;
    // A fresh builder instance should contain a blank product object
    // which it uses in further assembly.
    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTrip(boolean b) {
        car.setTrip(b);
    }

    @Override
    public void setGPS(boolean b) {

    }
}
