package main.java;

public class LuxuryCar extends Car {

    boolean panoramicSunroof;
    private int noOfSeats;

    @Override
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

    public LuxuryCar(int noOfSeats, int maxSpeed, double currentSpeed,
                     int seatHeight, String engine, boolean panoramicSunroof) {
        super(maxSpeed, currentSpeed, seatHeight, engine);
        this.panoramicSunroof = panoramicSunroof;
        this.noOfSeats = noOfSeats;
    }

    public boolean isPanoramicSunroof() {
        return panoramicSunroof;
    }


    private double applyBreak(int decrement) {
        setCurrentSpeed(getCurrentSpeed() - decrement);
        return getCurrentSpeed();
    }

    private void applyBreakAndAccelerate(int acceleration, int decrement) {
        double speedAfterBreak = applyBreak(decrement);
        setCurrentSpeed(speedAfterBreak + acceleration);
    }
}
