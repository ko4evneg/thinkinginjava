package ch07_reusingclasses.exercise13;
//Exercise 13: (2) Create a class with a method that is overloaded three times. Inherit a new class, add a new
//overloading of the method, and show that all four methods are available in the derived class.

import static thinkinginjava.util.Utils.print;

class Base {
    public void outPrint() {
        print("outPrint()");
    }

    public void outPrint(String s) {
        print("outPrint(" + s + ")");
    }

    public void outPrint(int i) {
        for (int j = 0; j < i; j++) {
            print("int outPrint(" + j + ")");
        }
    }

    public void outPrint(float f) {
        print("outPrint(f)");
    }
}

public class Exercise13 extends Base {
    public void outPrint(long l) {
        print("outPrint(l)");
    }

    public static void main(String[] args) {
        Exercise13 ex = new Exercise13();
        ex.outPrint();
        ex.outPrint("string");
        ex.outPrint(2);
        ex.outPrint(2.0f);
        ex.outPrint(3L);
    }
}
