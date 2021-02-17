package ch08_polymorphism.exercise7;
//Exercise 7: (2) Add a new type of Instrument to Music3.java and verify that polymorphism works for your new type.
import static thinkinginjava.Utils.print;

enum Note {
    MIDDLE_F,MIDDLE_C,MIDDLE_L
}

class Instrument {
    void play(Note n) { print("Instrument.play() " + n); }
    String what() { return "Instrument"; }
    void adjust() { print("Adjusting Instrument"); }

    @Override
    public String toString() {
        return what();
    }
}

class Keyboard extends Instrument {
    void play(Note n) { print("Keyboard.play() " + n); }
    String what() { return "Keyboard"; }
    void adjust() { print("Adjusting Keyboard"); }
}

class Wind extends Instrument {
    void play(Note n) { print("Wind.play() " + n); }
    String what() { return "Wind"; }
    void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Note n) { print("Percussion.play() " + n); }
    String what() { return "Percussion"; }
    void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Note n) { print("Stringed.play() " + n); }
    String what() { return "Stringed"; }
    void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind {
    void play(Note n) { print("Brass.play() " + n); }
    void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Note n) { print("Woodwind.play() " + n); }
    String what() { return "Woodwind"; }
}

public class Music3 {
    // Doesn’t care about type, so new types
// added to the system still work right:
    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }


    public static void main(String[] args) {
// Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Keyboard()
        };
        tuneAll(orchestra);
    }
}