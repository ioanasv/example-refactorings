package main.java.vehicles.birds.impl;

import main.java.vehicles.birds.impl.objects.BirdObject;
import main.java.vehicles.components.Calculator;

import java.util.List;

public class African extends BirdObject implements Eukaryota {

    public African(List<String> type, boolean isNailed) {
        super(type, isNailed);
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed() - getLoadFactor() * Calculator.numberOfCoconutss;
    }
}
