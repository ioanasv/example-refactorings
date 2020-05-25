package main.java;

public class LuxuryCar extends Car {

    boolean panoramicSunroof;
    private int noOfSeats;

    public String toString() {
        return getString() +
                ", noOfSeats=" + noOfSeats +
                ", engine='" + engine + '\'' +
                '}';
    }

    private String getString() {
        return "LuxuryCar{" +
                "panoramicSunroof=" + panoramicSunroof;
    }

    @SuppressWarnings("checkstyle:methodlength")
    public LuxuryCar(int noOfSeats, int maxSpeed, double currentSpeed,
                     int seatHeight, String engine, boolean panoramicSunroof) {
        super(maxSpeed, currentSpeed, seatHeight, engine);
        this.panoramicSunroof = panoramicSunroof;
        this.noOfSeats = noOfSeats;
    }

    public boolean isPanoramicSunroof() {
        return panoramicSunroof;
    }


    private void applyBreakAndContinue(int acceleration, int decrement) {
        setCurrentSpeed(getCurrentSpeed() - decrement);
        double speedAfterBreak = getCurrentSpeed();
        setCurrentSpeed(speedAfterBreak + acceleration);
    }
}
