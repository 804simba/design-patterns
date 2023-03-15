package com.designpatterns.Prototype;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class App {
    private final List<Shape> shapes = new ArrayList<>();

    public App() {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(20);
        shapes.add(circle);

        // this is an exact copy of the circle object.
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        shapes.add(rectangle);

        Rectangle anotherRectangle = (Rectangle) rectangle.clone();;
        shapes.add(anotherRectangle);
    }
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getShapes());
        List<Shape> shapesCopy = new ArrayList<>();

        for (Shape s : app.getShapes()) {
            shapesCopy.add(s.clone());
        }
        System.out.println("New array of cloned shapes: " + shapesCopy);
    }
}
