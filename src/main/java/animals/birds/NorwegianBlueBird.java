package main.java.animals.birds;

import main.java.animals.Eukaryota;

import java.util.List;

/**
 * Javadoc.
 */
public class NorwegianBlueBird implements Eukaryota {

    List<String> type;
    boolean isNailed;
    int noOfColors = 10;

    public NorwegianBlueBird(List<String> type, boolean isNailed) {
        this.type = type;
        this.isNailed = isNailed;
    }

    public static void europeanBird() {
        System.out.println("Hello! I am an European Bird.");
    }

    public String salute() {
        return "Hello! I am a Norvewgian Blue Bird.";
    }

    public String generalSalute() {
        return "Hello! I am a bird.";
    }
}
