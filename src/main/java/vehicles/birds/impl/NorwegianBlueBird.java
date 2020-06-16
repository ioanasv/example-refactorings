package main.java.vehicles.birds.impl;

import java.util.List;

/**
 *
 *
 *
 *
 *
 * Javadoc.
 */
public class NorwegianBlueBird extends BirdObject implements Eukaryota {


    public NorwegianBlueBird(List<String> type, boolean isNailed) {
        super(type, isNailed);
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : speed.getBaseSpeed();
    }

    /**
     * Javadoc.
     * @return 2 * loadfactor
     */
    public double getLoadFactorx2() {
        return loadfactor * 2;
    }
}
