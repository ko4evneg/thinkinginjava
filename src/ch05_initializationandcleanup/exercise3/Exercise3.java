package ch05_initializationandcleanup.exercise3;
//Exercise 3: (1) Create a class with a default constructor (one that takes no arguments) that prints a message.
//Create an object of this class.

import static thinkinginjava.Utils.print;

public class Exercise3 {
     Exercise3(){
         print("Constructor worked!");
    }

    public static void main(String[] args) {
        Exercise3 ex = new Exercise3();
    }
}
