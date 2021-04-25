package ch05_initializationandcleanup.exercise11;
//Exercise 11: (4) Modify the previous exercise so that your finalize( ) will always be called.

import ch05_initializationandcleanup.exercise10.Exercise10;

import static thinkinginjava.util.Utils.print;

public class Exercise11 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Exercise10 ex = new Exercise10();
            ex = null;
            System.gc();
        }
    }

    protected void finalize() {
        print("Object destroyed");
    }
}
