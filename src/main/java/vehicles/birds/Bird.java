package main.java.vehicles.birds;

public abstract class Bird extends Animalia {

    private String type;
    boolean isNailed;
    private double baseSpeed = 15.2;
    private double maxSpeed = 50.5;
    private String color;
    private double weight;

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

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setBaseSpeed(double baseSpeed) {
        this.baseSpeed = baseSpeed;
    }
}

