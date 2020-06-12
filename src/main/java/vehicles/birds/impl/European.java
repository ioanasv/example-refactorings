package main.java.vehicles.birds.impl;

import main.java.vehicles.birds.impl.objects.BirdObject;

import java.util.List;

public class European extends BirdObject implements Eukaryota {

    public European(List<String> type, boolean isNailed) {
        super(type, isNailed);
    }

    @Override
    public double getSpeed() {
        return speed.getBaseSpeed();
    }
}
