package ch05_initializationandcleanup.exercise17;

import static thinkinginjava.util.Utils.print;

//Exercise 17: (2) Create a class with a constructor that takes a String argument. During construction,
//print the argument. Create an array of object references to this class, but don’t actually create
//objects to assign into the array. When you run the program, notice whether the initialization messages
//from the constructor calls are printed.

public class Exercise17 {
    Exercise17 (String string) {
        print(string);
    }

    public static void main(String[] args) {
        Exercise17[] arr = new Exercise17[10];
    }
}
