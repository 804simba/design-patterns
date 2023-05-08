package com.design.patterns.prototype;

import lombok.Data;

/**
 * This is a creational design pattern that allows you copy existing objects
 * without making your code dependent on their classes. The cloning process is
 * delegated to the actual objects that are being cloned. The pattern declares
 * a common interface for all objects that supports cloning. This interface lets
 * you clone an object without coupling your code to the class of that object.
 *
 * An object that supports cloning is called a prototype. When your object has
 * dozens of fields and hundreds of configurations, cloning them might serve as
 * an alternative that subclassing.
 *
 * The prototype patterns lets you use a set of pre-built objects, configured in
 * various ways, as prototypes. Instead of instantiating a subclass that matches
 * some configuration, the client can simply look for an appropriate prototype and clone it.
 * */
@Data
public abstract class Shape {
    // Base Prototype
    // The shape abstract class defines the prototype for all shapes.
    // The clone() method in these classes creates a new instance of the object with the same values.
    private int X;
    private int Y;
    private String color;

    // A regular constructor
    public Shape() {
    }

    // The prototype constructor, where a fresh object is initialized with values
    // from the existing object.
    public Shape(Shape source) {
        this();
        this.X = source.X;
        this.Y = source.Y;
        this.color = source.color;
    }
    // the clone method returns one of the Shape subClasses
    public abstract Shape clone();
}
