package main.java;

public class SportsCar extends Car{


    private String engine;
    private int noOfSeats;

    public SportsCar(int noOfSeats, int maxSpeed, double currentSpeed, int seatHeight, String engine) {
        super(maxSpeed, currentSpeed, seatHeight);
        this.engine = engine;
        this.noOfSeats = noOfSeats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }
}
