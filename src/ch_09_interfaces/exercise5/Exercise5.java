package ch_09_interfaces.exercise5;
//Exercise 5: (2) Create an interface containing three methods, in its own package. Implement the interface in a
//different package.

import ch_09_interfaces.exercise5.pkg.Methods;

import static thinkinginjava.Utils.print;

public class Exercise5 implements Methods {
    @Override
    public void outA() {
        print("A");
    }

    @Override
    public void outB() {
        print("B");
    }

    @Override
    public void outC() {
        print("C");
    }
}
