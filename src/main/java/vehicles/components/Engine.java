package main.java.vehicles.components;

public class Engine {

    public static String engine;
    public static boolean turbo;
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public static Integer doCalc() {
        Integer temp = 10;
        temp *= 3;
        return temp;
    }

    public String getName() {
        return name;
    }
}