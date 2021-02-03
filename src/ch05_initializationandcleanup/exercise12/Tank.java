package ch05_initializationandcleanup.exercise12;
//Exercise 12: (4) Create a class called Tank that can be filled and emptied, and has a termination condition that it
// must be empty when the object is cleaned up. Write a finalize( ) that verifies this termination condition. In
// main( ), test the possible scenarios that can occur when your Tank is used.

import static thinkinginjava.Utils.print;

public class Tank {
    boolean isEmpty = true;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Tank t = new Tank();
            t.isEmpty = false;
            t = null;
            System.gc();
        }
        for (int i = 0; i < 100; i++) {
            Tank t = new Tank();
            t = null;
            System.gc();
        }

    }

    protected void finalize() {
        if (!isEmpty) {
            print("Emptying before destroying...");
        } else {
            print("Just destroying...");
        }
    }
}
