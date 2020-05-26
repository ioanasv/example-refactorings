package main.java.vehicles.components;

public class Utils {

    private static boolean b;
    private static boolean z;

    public static void parseString(String string) {
        Result.abc = string.toLowerCase().contains("abc");
        boolean abc = Result.abc;
        Utils.b = string.lastIndexOf(".") > 5;
        boolean b = Utils.b;
        Utils.z = string.endsWith("z");
        boolean z = Utils.z;
        boolean result = abc && b && z;
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
