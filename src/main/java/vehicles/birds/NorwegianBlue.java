package main.java.vehicles.birds;

import java.util.List;

public class NorwegianBlue extends Bird implements Eukaryota {


    public NorwegianBlue(List<String> type, boolean isNailed) {
        super(type, isNailed);
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed();
    }
}
