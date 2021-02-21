package ch_09_interfaces.exercise4;
//Exercise 4: (3) Create an abstract class with no methods. Derive a class and add a method. Create a static method that
//takes a reference to the base class, downcasts it to the derived class, and calls the method. In main( ), demonstrate
//that it works. Now put the abstract declaration for the method in the base class, thus eliminating the need for the
//downcast.

import static thinkinginjava.Utils.print;

abstract class Base {
    abstract void out();
}

public class Exercise4 extends Base {
    static void downCast(){
        Base b = new Exercise4();
        //((Exercise4) b).out();
        b.out();
    }

    void out(){
        print("out()");
    }

    public static void main(String[] args) {
        downCast();
    }
}
