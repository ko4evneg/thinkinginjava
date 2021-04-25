package ch07_reusingclasses.exercise3;
//Exercise 3: (2) Prove the previous sentence.

//You can see that the construction happens from the base “outward,” so the base class is
//initialized before the derived-class constructors can access it. Even if you don’t create a
//constructor for Cartoon( ), the compiler will synthesize a default constructor for you that
//calls the base class constructor.

import static thinkinginjava.util.Utils.print;

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
//    public Cartoon() {
//        print("Cartoon constructor");
//    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}