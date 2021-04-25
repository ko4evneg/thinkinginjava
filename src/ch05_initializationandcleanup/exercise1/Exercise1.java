package ch05_initializationandcleanup.exercise1;

import static thinkinginjava.util.Utils.print;
//Exercise 1: (1) Create a class containing an uninitialized String reference. Demonstrate that this reference is initialized by Java to null.

public class Exercise1 {
    static String s;
    public static void main(String[] args) {
        print(s);
    }
}
