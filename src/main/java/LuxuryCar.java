package main.java;

public class LuxuryCar extends Car {

    boolean panoramicSunroof;

    public LuxuryCar(int noOfSeats, int maxSpeed, int currentSpeed, int seatHeight, boolean panoramicSunroof) {
        super(noOfSeats, maxSpeed, currentSpeed, seatHeight);
        this.panoramicSunroof = panoramicSunroof;
    }

    public boolean isPanoramicSunroof() {
        return panoramicSunroof;
    }

    private int applyBreak(int decrement) {
        setCurrentSpeed(getCurrentSpeed() - decrement);
        return getCurrentSpeed();
    }

    private void applyBreakAndContinue(int acceleration, int decrement) {
        int speedAfterBreak = applyBreak(decrement);
        setCurrentSpeed(speedAfterBreak + acceleration);
    }
}
