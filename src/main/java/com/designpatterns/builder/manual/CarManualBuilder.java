package com.designpatterns.builder.manual;

public class CarManualBuilder {
    private Manual manual;

    public CarManualBuilder() {
    }
    public void reset() {
        this.manual = new Manual();
    }
    
}
