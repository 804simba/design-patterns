package com.design.patterns.builder.manual;

import com.design.patterns.builder.engine.Engine;
import com.design.patterns.builder.Builder;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
    }
    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        // document car seats features..
    }

    @Override
    public void setEngine(Engine engine) {
        // add engine instructions
    }

    @Override
    public void setTrip(boolean b) {
        // add trip computer instructions
    }

    @Override
    public void setGPS(boolean b) {
        // add GPS instructions.
    }
    public Manual getProduct() {
        return manual;
    }
}
