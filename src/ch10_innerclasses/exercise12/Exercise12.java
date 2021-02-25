package ch10_innerclasses.exercise12;
//Exercise 7: (2) Create a class with a private field and a private method. Create an inner class with a method that
//modifies the outer-class field and calls the outer-class method. In a second outer-class method, create an object of
//the inner class and call its method, then show the effect on the outer-class object.

//Exercise 12: (1) Repeat Exercise 7 using an anonymous inner class.

import static thinkinginjava.Utils.print;

public class Exercise12 {
    private int x = 12;

    private void out() {
        print("out(), x = " + x);
    }

    public void anonInit() {
        new Exercise12() {
            void runAnon() {
                ++x;
                out();
            }
        }.runAnon();
    }

    public static void main(String[] args) {
        Exercise12 ex = new Exercise12();
        ex.anonInit();
    }
}

