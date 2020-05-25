package main.java;

public class LuxuryCar extends Car {

    boolean panoramicSunroof;
    private int noOfSeats;

    public String toString() {
        return "LuxuryCar{" +
                "panoramicSunroof=" + panoramicSunroof +
                ", noOfSeats=" + noOfSeats +
                ", engine='" + engine + '\'' +
                '}';
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

    private void applyBreakAndContinue(int acceleration, int decrement) {
        double speedAfterBreak = applyBreak(decrement);
        setCurrentSpeed(speedAfterBreak + acceleration);
    }
}
