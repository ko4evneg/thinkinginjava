package ch03_operators.exercise8;

import static thinkinginjava.Utils.print;

//Exercise 8: (2) Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display
//the results.
public class Exercise8 {
    static long l;
    static long k;

    public static void main(String[] args) {
        l = 023;
        k = 0x64f;
        print(Long.toBinaryString(l) + " decimal: " + Long.parseLong(String.valueOf(l), 10));
        print(Long.toBinaryString(k) + " decimal: " + Long.parseLong(String.valueOf(k), 10));
    }
}
