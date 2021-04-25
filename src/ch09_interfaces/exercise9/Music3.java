package ch09_interfaces.exercise9;
//Exercise 9: (3) Refactor Musics.java by moving the common methods in Wind, Percussion and Stringed into an abstract
//class.

import static thinkinginjava.util.Utils.print;

enum Note {
    MIDDLE_F, MIDDLE_C, MIDDLE_L
}

abstract class Instrument {
    abstract void play(Note n);

    String what() {
        return "shit";
    }

    ;

    abstract void adjust();

    @Override
    public String toString() {
        return what();
    }
}

class Keyboard extends Instrument {
    void play(Note n) {
        print("Keyboard.play() " + n);
    }

    String what() {
        return "Keyboard";
    }

    void adjust() {
        print("Adjusting Keyboard");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        print("Wind.play() " + n);
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        print("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        print("Percussion.play() " + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        print("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        print("Stringed.play() " + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        print("Adjusting Stringed");
    }
}

class Brass extends Wind {
    void play(Note n) {
        print("Brass.play() " + n);
    }

    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        print("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }
}

public class Music3 {
    // Doesn’t care about type, so new types
// added to the system still work right:
    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }


    public static void main(String[] args) {
// Upcasting during addition to the array:
        Instrument[] orchestra = new Instrument[12];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = RandomInstrumentGenerator.getRandomInstrument();
        }
        tuneAll(orchestra);
    }
}