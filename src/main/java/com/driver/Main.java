package com.driver;

public class Main {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.drive();
        ford.start();
        ford.stop();

        F1 formulaCar = new F1();
        formulaCar.start();
        formulaCar.boost();
        formulaCar.stop();

        Boat ship = new Boat("INS Vikrant", 250);
        System.out.println("Boat Name: " + ship.getVehicleName());
        System.out.println("Boat Capacity: " + ship.getVehicleCapacity());
    }
}