package ch03_operators.exercise2;
//Exercise 2: (1) Create a class containing a float and use it to demonstrate aliasing.

import static thinkinginjava.Utils.print;

public class Exercise2 {
    public static void main(String[] args) {
        Obj obj1 = new Obj(2.34f);
        Obj obj2 = new Obj(6.17f);
        print(obj1.i + " " + obj2.i);
        obj1.i -= 1.23f;
        print(obj1.i + " " + obj2.i);
        obj2 = obj1;
        print(obj1.i + " " + obj2.i);
        obj1.i += 90.01f;
        print(obj1.i + " " + obj2.i);
    }
}

class Obj {
    public Obj(float i) {
        this.i = i;
    }

    float i;
}

