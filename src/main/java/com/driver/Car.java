package com.driver;

public class Car extends Vehicle{

    private int currentGear;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        // Note the order in super matches Vehicle constructor (doors, gears, wheels)
        super(name, doors, gears, wheels, isManual, type, seats);
        this.currentGear = 1;
    }

    // Override currentGear management if needed or use Vehicle's methods
    @Override
    public int getCurrentGear() {
        return currentGear;
    }

    @Override
    public void changeGear(int gear) {
        this.currentGear = gear;
    }

    // Use Vehicle's changeSpeed (or override if needed)
    @Override
    public void changeSpeed(int speed, int direction) {
        move(speed, direction);
    }
}
