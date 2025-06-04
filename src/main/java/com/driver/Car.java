package com.driver;

public class Car extends Vehicle {

    public Car() {
        super("DefaultCar", 4, 5, 4, true, "Sedan", 5);
    }

    public Car(String name, int doors, int gears, int wheels, boolean isManual, String type, int seats) {
        super(name, doors, gears, wheels, isManual, type, seats);
    }

    public void start() {
        System.out.println("Car started");
    }

    public void drive() {
        System.out.println("Car is driving");
    }

    public void stop() {
        super.stop();
        System.out.println("Car stopped");
    }

    @Override
    public String toString() {
        return "Car{name='" + getName() + "', type='" + getType() + "', seats=" + getSeats() + "}";
    }

}
