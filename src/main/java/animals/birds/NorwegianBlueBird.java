package main.java.animals.birds;

import main.java.animals.Eukaryota;

import java.util.List;

/**
 * Javadoc.
 */
public class NorwegianBlueBird extends TalkingBird implements Eukaryota {

    List<String> type;
    boolean isNailed;

    public NorwegianBlueBird(List<String> type, boolean isNailed) {
        this.type = type;
        this.isNailed = isNailed;
    }

    public String salute() {
        return "Hello! I am a Norvewgian Blue Bird.";
    }

}
