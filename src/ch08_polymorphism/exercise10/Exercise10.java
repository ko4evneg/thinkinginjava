package ch08_polymorphism.exercise10;
//Exercise 10: (3) Create a base class with two methods. In the first method, call the second method. Inherit a class
//and override the second method. Create an object of the derived class, upcast it to the base type, and call the first
//method. Explain what happens.

import java.util.Base64;

import static thinkinginjava.Utils.print;

class Base {
    void firstMethod() {
        secondMethod();
    }

    void secondMethod() {
        print("Base()");
    }
}

public class Exercise10 extends Base {
    public static void main(String[] args) {
        Base base = new Exercise10(); //Upcast
        base.firstMethod();
    }

    @Override
    void secondMethod() {
        print("Derived()");
    }
}
