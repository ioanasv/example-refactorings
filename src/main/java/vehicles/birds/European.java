package main.java.vehicles.birds;

import java.util.List;

public class European extends Bird implements Eukaryota {

    public European(List<String> type, boolean isNailed) {
        super(type, isNailed);
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }
}
