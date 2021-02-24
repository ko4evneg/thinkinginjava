package ch10_innerclasses.exercise11;
//Exercise 11: (2) Create a private inner class that implements a public interface. Write a method that returns a
//reference to an instance of the private inner class, upcast to the interface. Show that the inner class is completely
//hidden by trying to downcast to it.

import static thinkinginjava.Utils.print;

public class Exercise11 {
    private class VeryValuable implements Valuable {
        @Override
        public void getValue() {
            print("Very valuable!");
        }
    }

    static VeryValuable getVV() {
        return (VeryValuable) new Exercise11().new VeryValuable();
    }

    public static void main(String[] args) {
        Valuable v = Exercise11.getVV();
        ((VeryValuable) v).getValue();
    }
}

class Init {
    public static void main(String[] args) {
        Valuable v = Exercise11.getVV();
        // can't:
        // ((Exercise11.VeryValuable) v).getValue();
    }
}
