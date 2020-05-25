package main.java;

public class LuxuryCar extends Car {

    boolean panoramicSunroof;
    private int noOfSeats;

    public LuxuryCar(int noOfSeats, int maxSpeed, double currentSpeed, int seatHeight, boolean panoramicSunroof) {
        super(maxSpeed, currentSpeed, seatHeight);
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
