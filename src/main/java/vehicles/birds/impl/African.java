package main.java.vehicles.birds.impl;

import main.java.vehicles.components.Calculator;

import java.util.List;

public class African extends BirdObject implements Eukaryota {

    int noOfColors = 10;

    public African(List<String> type, boolean isNailed) {
        super(type, isNailed);
    }

    @Override
    public double getSpeed() {
        return speed.getBaseSpeed() - getLoadFactor() * Calculator.numberOfCoconutss;
    }

    /**
     * This is a Javadoc.
     *
     * @return 2 * loadfactor
     */
    public double getLoadFactorx2() {
        return loadfactor * 2;
    }
}
