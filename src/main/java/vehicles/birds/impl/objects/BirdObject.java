package main.java.vehicles.birds.impl.objects;

import main.java.vehicles.birds.impl.Animalia;

import java.util.List;

public abstract class BirdObject extends Animalia {

    private List<String> type;
    public boolean isNailed;
    private double baseSpeed = 15.2;
    private double maxSpeed = 50.5;

    final double loadfactor = 1.3;

    public BirdObject(List<String> type, boolean isNailed) {
        this.type = type;
        this.isNailed = isNailed;
    }

    public abstract double getSpeed();

    public double getBaseSpeed() {
        return baseSpeed;
    }

    public double getLoadFactor() {
        return loadfactor;
    }

    public double getLoadFactorx2() {
        return loadfactor * 2;
    }

    public double getLoadFactorx3() {
        return loadfactor * 2;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setBaseSpeed(double baseSpeed) {
        this.baseSpeed = baseSpeed;
    }
}

