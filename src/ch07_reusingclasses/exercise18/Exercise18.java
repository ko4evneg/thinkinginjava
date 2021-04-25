package ch07_reusingclasses.exercise18;
//Exercise 18: (2) Create a class with a static final field and a final field and demonstrate the difference between
//the two.

import java.util.Random;

import static thinkinginjava.util.Utils.print;

public class Exercise18 {
    static final int NUM = new Random().nextInt(10);
    final int fin = new Random().nextInt(10);

    public static void main(String[] args) {
        Exercise18 exOne = new Exercise18();
        Exercise18 exTwo = new Exercise18();
        print("NUM one: " + exOne.NUM);
        print("fin one: " + exOne.fin);
        print("NUM two: " + exTwo.NUM);
        print("fin one: " + exTwo.fin);
    }
}
