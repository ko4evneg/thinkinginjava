package ch03_operators.exercise11;
//Exercise 11: (3) Start with a number that has a binary one in the most significant position (hint: Use a hexadecimal
// constant). Using the signed right-shift operator, right shift it all the way through all of its binary positions,
// each time displaying the result using Integer.toBinaryString( ).

import static thinkinginjava.Utils.print;

public class Exercise11 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;
        print(Integer.toBinaryString(i) + " = " + i);

        for (int j = 1; j < 32; j++) {
            i >>= 1;
            print(Integer.toBinaryString(i) + " = " + i + " (dif: " + ((i << 1) - i) + ")");
        }
    }
}
