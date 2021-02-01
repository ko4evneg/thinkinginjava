package ch08_Polymorphism.Exercise7;
//Exercise 7: (2) Add a new type of Instrument to Music3.java and verify that polymorphism works for your new type.

public class Music4 {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }


    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            System.out.println(i.what());
            tune(i);
        }
    }

    public static void main(String[] args) {
// Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Drums()
        };
        tuneAll(orchestra);
    }

}

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    String what() {
        return this.toString();
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

//    String what() {
//        return "Wind";
//    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

//    String what() {
//        return "Percussion";
//    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

//    String what() {
//        return "Stringed";
//    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

//    String what() {
//        return "Woodwind";
//    }
}

class Drums extends Percussion {
    @Override
    void play(Note n) {
        System.out.println("Drums.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting drums");
    }
}

enum Note {
    MIDDLE_C
}





