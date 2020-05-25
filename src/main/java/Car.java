package main.java;

public class Car {

    private int noOfSeats;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    private int maxSpeed;
    private int currentSpeed;
    private int seatHeight;


    public Car(int noOfSeats, int maxSpeed, int currentSpeed, int seatHeight) {
        this.noOfSeats = noOfSeats;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.seatHeight = seatHeight;
    }
}