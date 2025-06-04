package com.driver;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("SomeName");

        System.out.println("Vehicle name: " + vehicle.getName());
        System.out.println("Vehicle doors: " + vehicle.getDoors());

        Car ford = new Car("Ford Mustang", 4, 2, 6, true, "Sedan", 5);

        // Add these methods in Car class or remove these calls
        ford.drive();
        ford.start();
        ford.stop();

        // Use constructor with default values or create an explicit constructor in F1
        F1 formulaCar = new F1("Ferrari F1", true);
        formulaCar.start();
        formulaCar.boost();
        formulaCar.stop();

        // Assuming Boat class has constructor and methods as used below
        Boat ship = new Boat("INS Vikrant", 250);
        System.out.println("Boat Name: " + ship.getVehicleName());
        System.out.println("Boat Capacity: " + ship.getVehicleCapacity());
    }
}