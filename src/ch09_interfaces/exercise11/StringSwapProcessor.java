package ch09_interfaces.exercise11;
//Exercise 11: (4) Create a class with a method that takes a String argument and produces a result that swaps each pair
//of characters in that argument. Adapt the class so that it works with interfaceprocessor.Apply.process( ).

import static thinkinginjava.util.Utils.print;
class StringSwapAdapater implements Processor {
    StringSwap ss;

    public StringSwapAdapater(StringSwap ss) {
        this.ss = ss;
    }

    @Override
    public String name() {
        return ss.toString();
    }

    @Override
    public String process(Object input) {
        return ss.swap(input);
    }
}

public class StringSwapProcessor {
    public static String s =
            "If she weighs the same as a duck, she’s made of wood";

    public static void main(String[] args) {
        Apply.process(new StringSwapAdapater(new StringSwap()), s);
        Apply.process(new StringSwapAdapater(new StringSwap()), s);
    }
}
