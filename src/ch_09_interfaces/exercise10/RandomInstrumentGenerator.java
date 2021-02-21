package ch_09_interfaces.exercise10;

import java.util.Random;

public class RandomInstrumentGenerator {
    static Random random = new Random();

    static Instrument getRandomInstrument(){
        int i = random.nextInt(6);
        switch (i) {
            case 0: return new Brass();
            case 1: return new Keyboard();
            case 2: return new Percussion();
            case 3: return new Wind();
            case 4: return new Stringed();
            case 5: return new Woodwind();
            default: return null;
        }
    }
}
