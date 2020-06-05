package main.java.vehicles.birds;

public abstract class Bird extends Animalia {

    private String type;
    boolean isNailed;
    private double baseSpeed = 15.2;

    public Bird(String type, boolean isNailed) {
        this.type = type;
        this.isNailed = isNailed;
    }

    public abstract double getSpeed();

    double getBaseSpeed() {
        return baseSpeed;
    }

    double getLoadFactor() {
        return 1.3;
    }
}
