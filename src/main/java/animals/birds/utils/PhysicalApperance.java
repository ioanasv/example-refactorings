package main.java.animals.birds.utils;

@Deprecated
public abstract class PhysicalApperance {
    private String color;
    private double weight;

    public PhysicalApperance() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}