package main.java.vehicles.components;

import main.java.vehicles.components.carComponents.EngineImpl;

public class Utils {
    public static Integer doCalculations() {
        Integer temp = EngineImpl.getInteger();
        return temp;
    }

    public void parseString(String string) {
        if (string.toLowerCase().contains("abc")
                && string.lastIndexOf(".") > 5 && string.endsWith("z")) {
            string = string.replace("x.x", "");
        } else {
            return;
        }
    }

}
