package ch05_initializationandcleanup.exercise7;
//Exercise 7: (1) Create a class without a constructor, and then create an object of that class in main( )
// to verify that the default constructor is automatically synthesized.

import static thinkinginjava.util.Utils.print;

public class Exercise7 {
    public static void main(String[] args) {
        Exercise7 ex = new Exercise7();
        print(ex);
    }
}
