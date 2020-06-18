package main.java.cars;

import main.java.components.carComponents.EngineImpl;

public class SportsCar extends Car{


    private Integer noofseats;

    public SportsCar(int noofseats, int maxSpeed, double currentSpeed, int seatHeight, String engine) {
        super(maxSpeed, currentSpeed, seatHeight, engine);
        this.noofseats = noofseats;
    }

    public void setEngine(String engine) {
        EngineImpl.engine = engine;
    }

    public String getEngine() {
        return EngineImpl.engine;
    }

    private void doubleSpeed() {
        this.getSpeed().setCurrentSpeed(this.getSpeed().getCurrentSpeed() * 2);
    }
}
