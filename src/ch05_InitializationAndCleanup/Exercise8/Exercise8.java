package ch05_InitializationAndCleanup.Exercise8;
//Exercise 8: (1) Create a class with two methods. Within the first method, call the second method twice: the first time
//without using this, and the second time using this—just to see it working; you should not use this form in practice.

import static thinkinginjava.Utils.print;

public class Exercise8 {
    public static void main(String[] args) {
        Exercise8 ex = new Exercise8();
        ex.firstMethod();
    }

    void firstMethod(){
        secondMethod();
        this.secondMethod();
    }

    void secondMethod(){
        print("second method");
    }
}
