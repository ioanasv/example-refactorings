package main.java;

public class LuxuryCar extends Car {

    static boolean panoramicSunroof;
    private int noOfSeats;

    public String toString() {
        return getString() +
                ", noOfSeats=" + noOfSeats +
                ", engine='" + Engine.engine + '\'' +
                '}';
    }

    private String getString() {
        return "LuxuryCar{" +
                "panoramicSunroof=" + panoramicSunroof;
    }

    @SuppressWarnings("checkstyle:executablestatementcount")
    public LuxuryCar(int noOfSeats, int maxSpeed, double currentSpeed,
                     int seatHeight, String engine, boolean panoramicSunroof) {
        super(maxSpeed, currentSpeed, seatHeight, engine);
        this.panoramicSunroof = panoramicSunroof;
        this.noOfSeats = noOfSeats;
    }

    public boolean isPanoramicSunroof() {
        return panoramicSunroof;
    }


}
