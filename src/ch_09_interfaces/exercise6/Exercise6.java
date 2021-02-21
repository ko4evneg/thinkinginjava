package ch_09_interfaces.exercise6;
//Exercise 6: (2) Prove that all the methods in an interface are automatically public.

import ch_09_interfaces.exercise6.pkg.Methods;

import static thinkinginjava.Utils.print;

public class Exercise6 implements Methods {
    @Override
    public void outA() {
        print("A");
    }
    // weaker access-privileges error
    // void outA() { print("A"); }

    @Override
    public void outB() {
        print("B");
    }

    @Override
    public void outC() {
        print("C");
    }

    public static void main(String[] args) {
        new Exercise6().outC();
    }
}
