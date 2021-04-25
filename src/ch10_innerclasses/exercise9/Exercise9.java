package ch10_innerclasses.exercise9;
//Exercise 9: (1) Create an interface with at least one method, and implement that interface by defining an inner class
//within a method, which returns a reference to your interface.

import static thinkinginjava.util.Utils.print;

interface Valuable {
    void getValue();
}

public class Exercise9 {
    static Valuable getNewObj(){
        class VeryValuable implements Valuable {
            @Override
            public void getValue() {
                print("Very valuable!");
            }
        }
        return new VeryValuable();
    }

    public static void main(String[] args) {
        Valuable v = Exercise9.getNewObj();
        v.getValue();
    }
}
