package main.java.vehicles.birds.impl;

import main.java.vehicles.birds.impl.objects.BirdObject;

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
}
