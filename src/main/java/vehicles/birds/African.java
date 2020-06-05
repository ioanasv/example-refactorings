package main.java.vehicles.birds;

import main.java.vehicles.components.Calculator;

public class African extends Bird implements Eukaryota {

    public African(String type, boolean isNailed) {
        super(type, isNailed);
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed() - getLoadFactor() * Calculator.numberOfCoconutss;
    }
}
