package main.java;

public class Car {

    protected static String engine;

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
        this.maxPossibleSpeed = maxPossibleSpeed;
        this.currentSpeed = currentSpeed;
        this.seatHeight = seatHeight;
        this.engine = engine;
    }
}