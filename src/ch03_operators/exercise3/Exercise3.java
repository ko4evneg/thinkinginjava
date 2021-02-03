package ch03_operators.exercise3;
//Exercise 3: (1) Create a class containing a float and use it to demonstrate aliasing during method calls.

import static thinkinginjava.Utils.print;

public class Exercise3 {
    public static void main(String[] args) {
        Obj obj1 = new Obj();
        print(obj1);
        changeFloat(obj1);
        print(obj1);
    }

    public static void changeFloat (Obj o) {
        o.f = 7.3f;
    }
}

class Obj {
    float f = 2.3f;

    @Override
    public String toString() {
        return "float f = " + f;
    }
}