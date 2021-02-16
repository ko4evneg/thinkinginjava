package thinkinginjava;

import static thinkinginjava.Utils.print;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
}

class Instrument {
    public void play(Note n) {
        print("Instrument.play()");
    }
}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}

public class Test {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
}