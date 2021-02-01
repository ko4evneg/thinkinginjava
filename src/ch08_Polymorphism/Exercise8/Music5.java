package ch08_Polymorphism.Exercise8;
//Exercise 8: (2) Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.

import java.util.Random;

public class Music5 {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }


    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            //System.out.println(i.what());
            tune(i);
        }
    }

    public static void main(String[] args) {
// Upcasting during addition to the array:
        Instrument[] orchestra = new Instrument[10];
        for (int i = 0; i < 10; i++) {
            Random r = new Random();

            switch (r.nextInt(5)) {
                case 0:
                    orchestra[i] = new Wind();
                    break;
                case 1:
                    orchestra[i] = new Percussion();
                    break;
                case 2:
                    orchestra[i] = new Stringed();
                    break;
                case 3:
                    orchestra[i] = new Brass();
                    break;
                case 4:
                    orchestra[i] = new Woodwind();
                    break;
                case 5:
                    orchestra[i] = new Drums();
                    break;
            }
        }
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





