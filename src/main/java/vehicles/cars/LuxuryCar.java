package main.java.vehicles.cars;

import main.java.vehicles.components.carComponents.EngineImpl;

public class LuxuryCar extends Car {

    private int noofseats;

    public String toString() {
        final String string = getString();
        return string +
                ", noOfSeats=" + noofseats +
                ", engine='" + EngineImpl.engine + '\'' +
                '}';
    }

    private String getString() {
        return "LuxuryCar{" +
                "panoramicSunroof=" + EngineImpl.turbo;
    }

    @SuppressWarnings("checkstyle:executablestatementcount")
    public LuxuryCar(int maxSpeed, int noOfSeats, double currentSpeed,
                     int seatHeight, String engine, boolean panoramicSunroof) {
        super(maxSpeed, currentSpeed, seatHeight, engine);
        EngineImpl.turbo = panoramicSunroof;
        this.noofseats = noOfSeats;
    }

    public boolean isPanoramicSunroof() {
        return EngineImpl.turbo;
    }


    private void doubleSpeed() {
        this.getSpeed().setCurrentSpeed(this.getSpeed().getCurrentSpeed() * 2);
    }

    public int getNoofseats() {
        return noofseats;
    }

    public void setNoofseats(int noofseats) {
        this.noofseats = noofseats;
    }
}
