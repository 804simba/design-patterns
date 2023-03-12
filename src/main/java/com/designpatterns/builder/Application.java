package com.designpatterns.builder;

import com.designpatterns.builder.car.Car;
import com.designpatterns.builder.car.CarBuilder;
import com.designpatterns.builder.manual.CarManualBuilder;
import com.designpatterns.builder.manual.Manual;

/***
 * The client code creates a builder object, passes it to the director
 * and then initiates the construction process. The end result is retrieved
 * from the builder object, and the director isn't aware of and not dependent
 * on concrete builders and products.
 */

public class Application {
    private Director director;
    void makeCar() {
        director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.makeSportsCar(carBuilder);
        Car car = carBuilder.getProduct();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.makeSportsCar(manualBuilder);
        Manual manual = manualBuilder.getProduct();
    }
}
