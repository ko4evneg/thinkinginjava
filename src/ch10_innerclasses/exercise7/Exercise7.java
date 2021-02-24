package ch10_innerclasses.exercise7;
//Exercise 7: (2) Create a class with a private field and a private method. Create an inner class with a method that
//modifies the outer-class field and calls the outer-class method. In a second outer-class method, create an object of
//the inner class and call its method, then show the effect on the outer-class object.

import static thinkinginjava.Utils.print;

public class Exercise7 {
    private int x = 12;
    private void out() {print("out(), x = " + x);}

    class Inner {
        void modifyX () {
            x++;
            out();
        }
    }

    public static void main(String[] args) {
        Inner i = new Exercise7().new Inner();
        i.modifyX();
    }
}
