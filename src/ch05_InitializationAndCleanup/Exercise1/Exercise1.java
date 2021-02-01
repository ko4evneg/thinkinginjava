package ch05_InitializationAndCleanup.Exercise1;

import static thinkinginjava.Utils.print;
//Exercise 1: (1) Create a class containing an uninitialized String reference. Demonstrate that this reference is initialized by Java to null.

public class Exercise1 {
    static String s;
    public static void main(String[] args) {
        print(s);
    }
}
