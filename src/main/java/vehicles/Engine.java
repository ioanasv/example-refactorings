package main.java.vehicles;

public class Engine {

    protected static String engine;
    static boolean turbo;
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
