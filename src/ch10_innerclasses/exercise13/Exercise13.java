package ch10_innerclasses.exercise13;
//Exercise 9: (1) Create an interface with at least one method, and implement that interface by defining an inner class
//within a method, which returns a reference to your interface.

//Exercise 13: (1) Repeat Exercise 9 using an anonymous inner class.

import static thinkinginjava.util.Utils.print;

interface Valuable {
    void getValue();
}

public class Exercise13 {

    static Valuable getNewObj() {
        return new Valuable() {
            @Override
            public void getValue() {
                print("Very valuable!");
            }
        };
    }

    public static void main(String[] args) {
        Valuable v = Exercise13.getNewObj();
        v.getValue();
    }
}
