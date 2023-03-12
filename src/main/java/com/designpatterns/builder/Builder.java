package com.designpatterns.builder;

import com.designpatterns.builder.engine.Engine;

// the builder interface specifies the methods for creating different parts of the product objects.
public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(Engine engine);
    void setTrip(boolean b);
    void setGPS(boolean b);
}
