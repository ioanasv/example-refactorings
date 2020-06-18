package main.java.vehicles.birds.impl;

import java.util.List;

public class European extends BirdObject implements Eukaryota {

    public European(List<String> type, boolean isNailed) {
        super(type, isNailed);
    }

    @Override
    public double getSpeed() {
        return speed.getBaseSpeed();
    }

    /**
     * Javadoc.
     *
     * @return 2 * loadfactor
     */
    public double getLoadFactorx2() {
        return loadfactor * 2;
    }

    public static void europeanBird() {
        System.out.println("Hello! I am an European Bird.");
    }
}
