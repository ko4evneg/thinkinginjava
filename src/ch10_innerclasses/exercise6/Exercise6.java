package ch10_innerclasses.exercise6;
//Exercise 6: (2) Create an interface with at least one method, in its own package. Create a class in a separate
//package. Add a protected inner class that implements the interface. In a third package, inherit from your class and,
//inside a method, return an object of the protected inner class, upcasting to the interface during the return.

import ch10_innerclasses.exercise6.interfaces.Swimmable;
import ch10_innerclasses.exercise6.pkg.Inherited;

import static thinkinginjava.util.Utils.print;

public class Exercise6 extends Inherited{

    public static void main(String[] args) {
        Inherited i = new Inherited();
        Swimmable s = i.getAnimal();
        s.swim();
        Swimmable t = new Exercise6().new Inner();
        t.swim();
    }
}
