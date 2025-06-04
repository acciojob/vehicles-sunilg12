package com.driver;

public class Main {
    public static void main(String[] args) {

        // Testing Vehicle class
        Vehicle vehicle = new Vehicle("TestVehicle");
        System.out.println("Vehicle name: " + vehicle.getName());
        System.out.println("Vehicle doors: " + vehicle.getDoors());

        // Testing Car class
        Car car = new Car("Honda Civic", 4, 5, 4, true, "Sedan", 5);
        car.start();
        car.drive();
        car.stop();

        // Testing F1 class
        F1 f1 = new F1("Red Bull F1", true);
        f1.start();
        f1.accelerate(60);
        f1.boost();
        f1.stop();

        // Testing Boat class
        Boat boat = new Boat("Titanic", 3000);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());
    }
}
