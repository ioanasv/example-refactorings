package main.java.vehicles.cars;

import main.java.vehicles.components.Utils;
import main.java.vehicles.components.carComponents.EngineImpl;

public class Car extends Vehicle{

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    private int maxPossibleSpeed;
    private double currentSpeed;
    private int seatHeight;


    public Car(int maxPossibleSpeed, double currentSpeed, int seatHeight, String engine) {
        initializeSpeeds(maxPossibleSpeed, currentSpeed);
        this.seatHeight = seatHeight;
        EngineImpl.engine = engine;
    }

    private void initializeSpeeds(int maxPossibleSpeed, double currentSpeed) {
        this.maxPossibleSpeed = maxPossibleSpeed;
        this.currentSpeed = currentSpeed;
    }

    private void doubleSpeed() {
        this.currentSpeed *= 2;
    }

    private void applyBreakAndContinue(int acceleration, int decrement) {
        setCurrentSpeed(getCurrentSpeed() - decrement);
        setCurrentSpeed(getCurrentSpeed() + acceleration + Utils.doCalculations());
    }

}