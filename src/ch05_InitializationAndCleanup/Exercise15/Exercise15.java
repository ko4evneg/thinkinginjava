package ch05_InitializationAndCleanup.Exercise15;
//Exercise 15: (1) Create a class with a String that is initialized using instance initialization.

import static thinkinginjava.Utils.print;

public class Exercise15 {
    String r;

    {
        r = "String";
    }

    public static void main(String[] args) {
        print("psvm " + new Exercise15().r);
    }
}
