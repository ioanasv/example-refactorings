package main.java.vehicles.cars;

import main.java.vehicles.components.Utils;
import main.java.vehicles.components.carComponents.EngineImpl;

public class Car extends Vehicle{

    private final Speed speed = new Speed();

    public double getCurrentSpeed() {
        return speed.getCurrentSpeed();
    }

    public void setCurrentSpeed(double currentSpeed) {
        speed.setCurrentSpeed(currentSpeed);
    }

    public int getMaxPossibleSpeed() {
        return speed.getMaxPossibleSpeed();
    }

    public void setMaxPossibleSpeed(int maxPossibleSpeed) {
        speed.setMaxPossibleSpeed(maxPossibleSpeed);
    }

    private int seatHeight;


    public Car(int maxPossibleSpeed, double currentSpeed, int seatHeight, String engine) {
        initializeSpeeds(maxPossibleSpeed, currentSpeed);
        this.seatHeight = seatHeight;
        EngineImpl.engine = engine;
    }

    private void initializeSpeeds(int maxPossibleSpeed, double currentSpeed) {
        this.speed.setMaxPossibleSpeed(maxPossibleSpeed);
        this.speed.setCurrentSpeed(currentSpeed);
    }

    private void doubleSpeed() {
        this.speed.setCurrentSpeed(this.speed.getCurrentSpeed() * 2);
    }

    private void applyBreakAndContinue(int acceleration, int decrement) {
        speed.setCurrentSpeed(speed.getCurrentSpeed() - decrement);
        speed.setCurrentSpeed(speed.getCurrentSpeed() + acceleration + Utils.doCalculations());
    }

}