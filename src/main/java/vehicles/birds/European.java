package main.java.vehicles.birds;

public class European extends Bird implements Eukaryota {

    public European(String type, boolean isNailed) {
        super(type, isNailed);
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }
}
