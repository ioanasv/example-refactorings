package main.java;

public class SportsCar extends Car{


    private int noOfSeats;

    public SportsCar(int noOfSeats, int maxSpeed, double currentSpeed, int seatHeight, String engine) {
        super(maxSpeed, currentSpeed, seatHeight, engine);
        this.noOfSeats = noOfSeats;
    }

    public void setEngine(String engine) {
        Engine.engine = engine;
    }

    public String getEngine() {
        return Engine.engine;
    }
}
