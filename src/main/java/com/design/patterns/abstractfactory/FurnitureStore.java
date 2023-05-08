package com.design.patterns.abstractfactory;
/***
 * Abstract Factory is used when your code needs to work with various families of related products,
 * but you don't want it to depend on the concrete classes of those products, thus allowing for
 * future extensibility. It therefore provides you with an interface for creating from each class of the
 * product family.
 *
 */


interface Chair {
    void sitOn();
}
interface FurnitureFactory {
    Chair createChair();
}

class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }
}

class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }
}
class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a victorian chair...");
    }
}
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair...");
    }
}
public class FurnitureStore {
    public static void main(String[] args) {
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureFactory modernFactory = new ModernFurnitureFactory();

        Chair victorianChair = victorianFactory.createChair();
        victorianChair.sitOn();

        Chair modernChair = modernFactory.createChair();
        modernChair.sitOn();
    }
}
