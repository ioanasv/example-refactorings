package main.java.vehicles.birds;

public abstract class Bird extends Animalia {

    final Speed speed = new Speed();
    private String type;
    boolean isNailed;

    public Bird(String type, boolean isNailed) {
        this.type = type;
        this.isNailed = isNailed;
    }

    public abstract double getSpeed();

    double getBaseSpeed() {
        return speed.getBaseSpeed();
    }

    double getLoadFactor() {
        return 1.3;
    }

    public double getMaxSpeed() {
        return speed.getMaxSpeed();
    }

    public void setMaxSpeed(double maxSpeed) {
        speed.setMaxSpeed(maxSpeed);
    }

    public void setBaseSpeed(double baseSpeed) {
        speed.setBaseSpeed(baseSpeed);
    }
}

