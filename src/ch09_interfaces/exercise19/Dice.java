package ch09_interfaces.exercise19;

import java.util.Random;

import static thinkinginjava.util.Utils.print;

public class Dice implements TossedItem {
    Random r = new Random();

    @Override
    public void toss() {
        String s = String.valueOf(r.nextInt(6) + 1);
        print("Dice tossed to " + s);
    }
}
