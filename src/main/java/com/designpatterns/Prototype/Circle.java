package com.designpatterns.Prototype;

import lombok.Data;

@Data
public class Circle extends Shape{
    private int radius;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}