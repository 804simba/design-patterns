package com.design.patterns.prototype;

import lombok.Data;

// Concrete prototype. The cloning method creates a new object and passes it to the constructor.
// This keeps the cloning result consistent as the constructor has a refresh to a fresh clone.
@Data
public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle() {
    }
    public Rectangle(Rectangle source) {
        // a parent constructor call is needed to copy private fields defined in the parent class.
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
