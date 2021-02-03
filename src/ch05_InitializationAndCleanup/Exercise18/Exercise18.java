package ch05_InitializationAndCleanup.Exercise18;

import static thinkinginjava.Utils.print;

//Exercise 17: (2) Create a class with a constructor that takes a String argument. During construction,
//print the argument. Create an array of object references to this class, but don’t actually create
//objects to assign into the array. When you run the program, notice whether the initialization messages
//from the constructor calls are printed.

//Exercise 18: (1) Complete the previous exercise by creating objects to attach to the array of
//references.

public class Exercise18 {
    Exercise18(String string) {
        print(string);
    }

    public static void main(String[] args) {
        Exercise18[] arr = new Exercise18[10];
        int i = 1;
        for (Exercise18 exercise18 : arr) {
            exercise18 = new Exercise18(String.valueOf(i++));
        }
    }
}
