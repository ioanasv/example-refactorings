package main.java.animals.birds;

import main.java.animals.Eukaryota;

import java.util.List;

public class European extends TalkingBird implements Eukaryota {

    int noOfColors = 10;

    public European(List<String> type, boolean isNailed) {
    }

    public static void europeanBird() {
        System.out.println("Hello! I am an European Bird.");
    }

    public String generalSalute() {
        return super.generalSalute();
    }
}
