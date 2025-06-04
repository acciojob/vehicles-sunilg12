package com.driver;

public class Vehicle {

    private String name;
    private int doors;
    private int gears;
    private int wheels;
    private boolean isManual;
    private String type;
    private int seats;
    private int currentGear;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name, int doors, int gears, int wheels, boolean isManual, String type, int seats) {
        this.name = name;
        this.doors = doors;
        this.gears = gears;
        this.wheels = wheels;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public Vehicle(String name) {
        this(name, 4, 5, 4, true, "Sedan", 5); // standard default values
    }

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isManual() {
        return isManual;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void changeGear(int gear) {
        this.currentGear = gear;
    }

    public void changeSpeed(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
    }

    public void steer(int direction) {
        this.currentDirection = direction;
    }

    public void move(int speed, int direction) {
        changeSpeed(speed, direction);
    }

    public void stop() {
        this.currentSpeed = 0;
    }
}
