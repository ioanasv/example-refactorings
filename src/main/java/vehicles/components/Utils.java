package main.java.vehicles.components;

import main.java.vehicles.components.carComponents.EngineImpl;

public class Utils {
    public static Integer doCalculations() {
        Integer temp = EngineImpl.getInteger();
        return temp;
    }

    public void parseString(String string) {
        final boolean abc = string.toLowerCase().contains("abc");
        final boolean b = string.lastIndexOf(".") > 5;
        final boolean z = string.endsWith("z");
        boolean res = abc && b && z;
        if (res) {
            string = string.replace("x.x", "");
        } else {
            return;
        }
    }

}
