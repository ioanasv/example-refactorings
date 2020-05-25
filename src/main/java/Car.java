package main.java;

public class Car {

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    private int maxPossibleSpeed;
    private double currentSpeed;
    private int seatHeight;


    public Car(int maxPossibleSpeed, double currentSpeed, int seatHeight) {
        this.maxPossibleSpeed = maxPossibleSpeed;
        this.currentSpeed = currentSpeed;
        this.seatHeight = seatHeight;
    }
}