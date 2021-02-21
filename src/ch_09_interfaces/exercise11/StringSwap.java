package ch_09_interfaces.exercise11;
//Exercise 11: (4) Create a class with a method that takes a String argument and produces a result that swaps each pair
//of characters in that argument. Adapt the class so that it works with interfaceprocessor.Apply.process( ).

import static thinkinginjava.Utils.print;

public class StringSwap {
    private static int counter = 0;
    private final int ref = counter++;

    String swap(String s) {
        char[] str = s.toCharArray();
        for (int i = 1; i < str.length; i += 2) {
            char c = str[i];
            str[i] = str[i - 1];
            str[i - 1] = c;
        }
        return (new String(str));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ":" + ref;
    }

    //test
    public static void main(String[] args) {
        new StringSwap().swap("lastringa!");
    }
}
