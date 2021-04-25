package ch10_innerclasses.exercise26;
//Exercise 26: (2) Create a class with an inner class that has a non-default constructor (one that takes arguments).
//Create a second class with an inner class that inherits from the first inner class.

import static thinkinginjava.util.Utils.print;

public class Exercise26 {
    class Inner {
        public Inner(int i) {
            print(i);
        }
    }

    public static void main(String[] args) {
        new InheritingInner(new Exercise26());
    }
}

class InheritingInner extends Exercise26.Inner {
    InheritingInner(Exercise26 ex) {
        ex.super(5);
    }
}
