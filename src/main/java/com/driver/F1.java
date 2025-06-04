package com.driver;

public class F1 extends Vehicle{
    public F1() {
        // Default constructor - call super with some defaults or empty
        super("DefaultF1", 1, 0, 4, false, "F1", 1);
    }

    // Constructor matching your test cases:
    public F1(String name, boolean isManual) {
        // Pass proper values to Vehicle constructor
        // Assuming F1 has 0 doors, 6 gears, 4 wheels, type = "F1", seats = 1
        super(name, 0, 6, 4, isManual, "F1", 1);
    }

    // Accelerate method that changes speed and gear based on some logic
    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        if (newSpeed == 0) {
            stop(); // inherited from Vehicle
            changeGear(1); // reset gear to 1
        } else if (newSpeed > 0 && newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed > 50 && newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed > 100 && newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed > 150 && newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed > 200) {
            changeGear(5);
        }

        changeSpeed(newSpeed, getCurrentDirection()); // update speed & keep direction same
    }

    public void start() {
        System.out.println("F1 car started");
    }

    public void boost() {
        System.out.println("F1 car is boosting");
    }
}
