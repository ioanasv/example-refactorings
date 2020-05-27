package main.java.vehicles.birds;

public class African extends Bird{

    public African(String type, boolean isNailed) {
        super(type, isNailed);
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
    }
}
