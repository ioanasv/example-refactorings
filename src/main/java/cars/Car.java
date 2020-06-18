package main.java.cars;

import main.java.components.Calculator;
import main.java.components.carComponents.EngineImpl;

public class Car extends Vehicle {

    private final Speed speed = new Speed();


    public double getCurrentSpeed() {
        return getSpeed().getCurrentSpeed();
    }

    public void setCurrentSpeed(double currentSpeed) {
        getSpeed().setCurrentSpeed(currentSpeed);
    }

    public int getMaxPossibleSpeed() {
        return getSpeed().getMaxPossibleSpeed();
    }

    public void setMaxPossibleSpeed(int maxPossibleSpeed) {
        getSpeed().setMaxPossibleSpeed(maxPossibleSpeed);
    }

    private int seatHeight;


    @Deprecated
    public Car(int maxPossibleSpeed, double currentSpeed, int seatHeight, String engine) {
        initializeSpeeds(maxPossibleSpeed, currentSpeed);
        this.seatHeight = seatHeight;
        EngineImpl.engine = engine;
    }

    private void initializeSpeeds(int maxPossibleSpeed, double currentSpeed) {
        this.getSpeed().setMaxPossibleSpeed(maxPossibleSpeed);
        this.getSpeed().setCurrentSpeed(currentSpeed);
    }

    private void applyBreakAndContinue(int acceleration, int decrement) {
        getSpeed().setCurrentSpeed(getSpeed().getCurrentSpeed() - decrement);
        getSpeed().setCurrentSpeed(getSpeed().getCurrentSpeed() + acceleration + Calculator.doCalculations());
    }

    public Speed getSpeed() {
        return speed;
    }

}