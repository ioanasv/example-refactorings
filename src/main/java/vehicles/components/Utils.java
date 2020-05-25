package main.java.vehicles.components;

import main.java.vehicles.components.carComponents.EngineImpl;

public class Utils {
    public static Integer doCalculations() {
        Integer temp = EngineImpl.getInteger();
        return temp;
    }

    public void parseString(String string) {
        final boolean abc = string.toLowerCase().contains("abc");
        final boolean index = string.lastIndexOf(".") > 5;
        final boolean endsWith = string.endsWith("z");
        if (abc && index && endsWith) {
            string = string.replace("x.x", "");
        } else {
            return;
        }
    }

}
