package ch06_accesscontrol.exercise3;
//Exercise 3: (2) Create two packages: debug and debugoff, containing an identical class with a
// debug( ) method. The first version displays its String argument to the console, the second
// does nothing. Use a static import line to import the class into a test program, and demonstrate
// the conditional compilation effect.

import static ch06_accesscontrol.exercise3.debug.Example.debug;
//import static ch06_accesscontrol.ch15_generics.exercise3.debugoff.Example.debug;

public class Init {
    public static void main(String[] args) {
        debug("arg");
    }
}
