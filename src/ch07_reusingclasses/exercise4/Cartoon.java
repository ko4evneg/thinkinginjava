package ch07_reusingclasses.exercise4;
//Exercise 4: (2) Prove that the base-class constructors are (a) always called and (b) called
//before derived-class constructors.

import static thinkinginjava.Utils.print;

class Art {
    Art() {
        print("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}