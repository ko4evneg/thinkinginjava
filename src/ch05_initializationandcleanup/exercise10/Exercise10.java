package ch05_initializationandcleanup.exercise10;
//Exercise 10: (2) Create a class with a finalize( ) method that prints a message.
// In main( ), create an object of your class. Explain the behavior of your program.

import static thinkinginjava.Utils.print;

public class Exercise10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Exercise10 ex = new Exercise10();
        }
    }

    protected void finalize() {
        print("Object destroyed");
    }
}
