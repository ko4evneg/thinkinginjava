package ch10_innerclasses.exercise1;
//Exercise 1: (1) Write a class named Outer that contains an inner class named Inner. Add a method to Outer that returns
//an object of type Inner. In main( ), create and initialize a reference to an Inner.

import static thinkinginjava.util.Utils.print;

public class Outer {
    class Inner {
        int i = 3;
    }

    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Inner inner = new Outer().getInner();
        print(inner.i);
    }
}
