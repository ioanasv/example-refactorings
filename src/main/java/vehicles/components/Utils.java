package main.java.vehicles.components;

import main.java.vehicles.components.carComponents.EngineImpl;

public class Utils {
    public static Integer doCalculations() {
        Integer temp = EngineImpl.getInteger();
        return temp;
    }

    public static void parseString(String string) {
        boolean result = string.toLowerCase().contains("abc") && string.lastIndexOf(".") > 5
                && string.endsWith("z");
        if (result) {
            string = string.replace("x.x", "");
        } else {
            return;
        }
    }

    public static void print(int height, int width) {
        final double perimeter = 2 * (height + width);
        System.out.println(perimeter);
        final double area = height * width;
        System.out.println(area);
    }

}
