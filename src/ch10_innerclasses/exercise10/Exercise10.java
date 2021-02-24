package ch10_innerclasses.exercise10;
//Exercise 10: (1) Repeat the previous exercise but define the inner class within a scope within a method.

import static thinkinginjava.Utils.print;

interface Valuable {
    void getValue();
}

public class Exercise10 {
    static Valuable getNewObj(){
        Valuable v;
        if (true) {
            class VeryValuable implements Valuable {
                @Override
                public void getValue() {
                    print("Very valuable!");
                }
            }
            v = new VeryValuable();
        }
        return v;
    }

    public static void main(String[] args) {
        Valuable v = Exercise10.getNewObj();
        v.getValue();
    }
}
