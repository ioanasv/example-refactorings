package main.java.vehicles.birds;

public class Speed {
    double baseSpeed = 15.2;
    double maxSpeed = 50.5;

    public Speed() {
    }

    double getBaseSpeed() {
        return baseSpeed;
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