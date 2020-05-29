package main.java.vehicles.components.carComponents;

@Deprecated
public class EngineImpl implements Engine{

    public static String engine;
    @SuppressWarnings("checkstyle:2")
    public static boolean turbo;
    private String name;

    public EngineImpl(String name) {
        this.name = name;
    }

    public static Integer getInteger() {
        Integer temp = 10;
        temp *= 3;
        return temp;
    }

    public String getName() {
        return name;
    }
}
