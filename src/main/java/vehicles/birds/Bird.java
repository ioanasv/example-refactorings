package main.java.vehicles.birds;

public class Bird {

    private String type;
    private boolean isNailed;
    private int numberOfCoconuts = 10;

    public Bird(String type, boolean isNailed) {
        this.type = type;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        switch (type) {
            case "EUROPEAN":
                return getBaseSpeed();
            case "AFRICAN":
                return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
            case "NORWEGIAN_BLUE":
                return (isNailed) ? 0 : getBaseSpeed();
        }
        throw new RuntimeException("Should be unreachable");
    }

   private double getBaseSpeed() {
        return 15.2;
   }

   private double getLoadFactor() {
        return 1.3;
   }
}
