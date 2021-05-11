package main.java.vehicles.components.carComponents;

@SuppressWarnings("checkstyle:1")
public class EngineImpl implements Engine{

    public static String engine;
    public static boolean turbo;







    private String name;

    public EngineImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
