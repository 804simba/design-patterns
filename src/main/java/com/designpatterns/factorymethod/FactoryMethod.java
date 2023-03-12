package com.designpatterns.factorymethod;

// both truck and ship classes should implement the transport interface and have their own implementations.

// Product Interface
interface Transport {
    void deliver();
}
// Concrete product truck.
class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering goods by truck...");
    }

}
// Concrete Product Ship
class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering goods by ship...");
    }
}
// Creator interface
interface TransportCreator {
    Transport createTransport();
}
// concrete creators override the base factory method, so it returns a different type of object.
class TruckTransportCreator implements TransportCreator {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
class ShipTransportCreator implements TransportCreator {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
public class FactoryMethod {
    public static void main(String[] args) {
        // create a transport using truck creator
        TransportCreator truckCreator = new TruckTransportCreator();
        Transport truckTransport = truckCreator.createTransport();
        truckTransport.deliver();

        // create a ship using ship creator
        TransportCreator shipCreator = new ShipTransportCreator();
        Transport shipTransport = shipCreator.createTransport();
        shipTransport.deliver();
    }
}
