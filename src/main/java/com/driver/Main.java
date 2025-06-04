package com.driver;

public class Main {
    public static void main(String[] args) {

        F1 formulaOne = new F1();
        formulaOne.boost();
        formulaOne.drive();
        formulaOne.start();
        formulaOne.stop();

        Boat boat = new Boat("INS Vikrant", 250);
        System.out.println(boat.getVehicleCapacity());
        System.out.println(boat.getVehicleName());

    }
}