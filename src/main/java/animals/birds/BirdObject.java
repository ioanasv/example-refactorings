package main.java.animals.birds;

import main.java.animals.Animalia;
import main.java.animals.birds.utils.Speed;

import javax.annotation.processing.Generated;
import java.util.List;

public abstract class BirdObject extends Animalia {

    public final Speed speed = new Speed();
    private List<String> type;
    public boolean isNailed;

    public final double loadfactor = 1.3;

    public BirdObject(List<String> type, boolean isNailed) {
        this.type = type;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return speed.getBaseSpeed();
    }

    public double getBaseSpeed() {
        return speed.getBaseSpeed();
    }

    public double getLoadFactor() {
        return loadfactor;
    }

    /**
     * javadoc
     *
     * @return double
     */
    @Deprecated
    @SuppressWarnings("checkstyle2")
    @Generated("")
    public double getLoadFactorx9() {
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

    /**
     * Javadoc.
     *
     * @return 2 * loadfactor
     */
    public double getLoadFactorx2() {
        return loadfactor * 2;
    }
}

