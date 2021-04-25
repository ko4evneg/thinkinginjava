package ch10_innerclasses.exercise6.pkg;

import ch10_innerclasses.exercise6.interfaces.Swimmable;

import static thinkinginjava.util.Utils.print;

public class Inherited {

    protected class Inner implements Swimmable {
        public Inner() {
        }

        @Override
        public void swim() {
            print("Swimming...");
        }
    }

    public Swimmable getAnimal() {
        return new Inner();
    }
}
