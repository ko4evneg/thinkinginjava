package ch09_interfaces.exercise19;

import thinkinginjava.util.Utils;

import java.util.Random;

public class Coin implements TossedItem {
    Random r = new Random();

    @Override
    public void toss() {
        String s = r.nextInt(2) == 0 ? "face" : "back";
        Utils.print("Coin tossed to " + s);
    }
}
