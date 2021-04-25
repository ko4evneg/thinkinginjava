package ch10_innerclasses.exercise5;
//Exercise 5: (1) Create a class with an inner class. In a separate class, make an instance of the inner class.

import static thinkinginjava.util.Utils.print;

public class Exercise5 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        print(inner);
        print(inner.getOuter());
    }
}
