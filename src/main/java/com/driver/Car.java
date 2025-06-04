package com.driver;

public class Car extends Vehicle{


    public Car(String name, int doors, int gears, int wheels, boolean isManual, String type, int seats) {
        super(name, doors, gears, wheels, isManual, type, seats);
    }

    public void drive() {
        System.out.println("Car is driving");
    }

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        super.stop();  // sets speed to 0
        System.out.println("Car stopped");
    }
}
