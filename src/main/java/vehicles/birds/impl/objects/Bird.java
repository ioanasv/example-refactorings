package main.java.vehicles.birds.impl.objects;

import main.java.vehicles.birds.impl.Animalia;

import java.util.List;

public abstract class Bird extends Animalia {

    public final Speed speed = new Speed();
    private List<String> type;
    public boolean isNailed;

    public final double loadfactor = 1.3;

    public Bird(List<String> type, boolean isNailed) {
        this.type = type;
        this.isNailed = isNailed;
    }

    public abstract double getSpeed();

    public double getBaseSpeed() {
        return speed.getBaseSpeed();
    }

    public double getLoadFactor() {
        return loadfactor;
    }

    public double getLoadFactorx3() {
        return loadfactor * 2;
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

class MyInnerClasss {

}

