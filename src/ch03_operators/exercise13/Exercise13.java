package ch03_operators.exercise13;
//Exercise 13: (1) Write a method that displays char values in binary form. Demonstrate it using several different characters.

import static thinkinginjava.util.Utils.print;

public class Exercise13 {
    public static void main(String[] args) {
        displayChar('a');
        displayChar(';');
    }

    static void displayChar(char c){
        short sh = (short) c;
        print(Integer.toBinaryString(sh));
    }
}
