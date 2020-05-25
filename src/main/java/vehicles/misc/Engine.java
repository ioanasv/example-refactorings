package main.java.vehicles.misc;

public class Engine {

    public static String engine;
    public static boolean turbo;
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public static int doCalc() {
        int dummy = 10;
        dummy *= 3;
        return dummy;
    }

    public String getName() {
        return name;
    }
}
