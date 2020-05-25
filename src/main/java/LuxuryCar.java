package main.java;

public class LuxuryCar extends Car {

    private int noOfSeats;

    public String toString() {
        return getString() +
                ", noOfSeats=" + noOfSeats +
                ", engine='" + Engine.engine + '\'' +
                '}';
    }

    private String getString() {
        return "LuxuryCar{" +
                "panoramicSunroof=" + Engine.turbo;
    }

    @SuppressWarnings("checkstyle:executablestatementcount")
    public LuxuryCar(int noOfSeats, int maxSpeed, double currentSpeed,
                     int seatHeight, String engine, boolean panoramicSunroof) {
        super(maxSpeed, currentSpeed, seatHeight, engine);
        Engine.turbo = panoramicSunroof;
        this.noOfSeats = noOfSeats;
    }

    public boolean isPanoramicSunroof() {
        return Engine.turbo;
    }


}
