package ch_09_interfaces.exercise10;
//Exercise 10: (3) Modify Musics.java by adding a Playable interface. Move the play( ) declaration from Instrument to
//Playable. Add Playable to the derived classes by including it in the implement s list. Change tune( ) so that it takes
//a Playable instead of an Instrument.

import static thinkinginjava.Utils.print;

enum Note {
    MIDDLE_F, MIDDLE_C, MIDDLE_L
}

abstract class Instrument {
    String what() {
        return "shit";
    }
    abstract void adjust();

    @Override
    public String toString() {
        return what();
    }
}

interface Playable {
    void play(Note n);
}

class Keyboard extends Instrument implements Playable{
    public void play(Note n) {
        print("Keyboard.play() " + n);
    }

    String what() {
        return "Keyboard";
    }

    void adjust() {
        print("Adjusting Keyboard");
    }
}

class Wind extends Instrument implements Playable{
    public void play(Note n) {
        print("Wind.play() " + n);
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        print("Adjusting Wind");
    }
}

class Percussion extends Instrument implements Playable{
    public void play(Note n) {
        print("Percussion.play() " + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        print("Adjusting Percussion");
    }
}

class Stringed extends Instrument implements Playable{
    public void play(Note n) {
        print("Stringed.play() " + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        print("Adjusting Stringed");
    }
}

class Brass extends Wind implements Playable{
    public void play(Note n) {
        print("Brass.play() " + n);
    }

    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind extends Wind implements Playable{
    public void play(Note n) {
        print("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }
}

public class Music3 {
    // Doesn’t care about type, so new types
// added to the system still work right:
    public static void tune(Playable i) {
// ...
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune((Playable) i);
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