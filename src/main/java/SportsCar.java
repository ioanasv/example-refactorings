package main.java;

public class SportsCar extends Car{


    private String engine;

    public SportsCar(int noOfSeats, int maxSpeed, int currentSpeed, int seatHeight, String engine) {
        super(noOfSeats, maxSpeed, currentSpeed, seatHeight);
        this.engine = engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }
}
