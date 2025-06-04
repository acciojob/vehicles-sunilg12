package com.driver;

public class F1 extends Vehicle {

    public F1() {
        super("DefaultF1", 0, 6, 4, true, "F1", 1);
    }

    public F1(String name, boolean isManual) {
        super(name, 0, 6, 4, isManual, "F1", 1);
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed <= 200) {
            changeGear(4);
        } else {
            changeGear(5);
        }

        changeSpeed(newSpeed, getCurrentDirection());
    }

    public void start() {
        System.out.println("F1 car started");
    }

    public void boost() {
        System.out.println("F1 car is boosting");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("F1 car stopped");
    }
}
