package main.java.vehicles.birds;

public abstract class Bird extends Animalia {

    private String type;
    boolean isNailed;
    private double baseSpeed = 15.2;
    private double maxSpeed = 50.5;

    double loadfactor = 1.3;
    public Bird(String type, boolean isNailed) {
        this.type = type;
        this.isNailed = isNailed;
    }

    public abstract double getSpeed();

    double getBaseSpeed() {
        return baseSpeed;
    }

    double getLoadFactor() {
        return loadfactor;
    }

    double getLoadFactorx2() {
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

