package ch03_operators.exercise12;
//Exercise 12: (3) Start with a number that is all binary ones. Left shift it, then use the unsigned right-shift
//operator to right shift through all of its binary positions, each time displaying the result using Integer.toBinaryString( ).


import static thinkinginjava.util.Utils.print;

public class Exercise12 {
    static int i = ~0;

    public static void main(String[] args) {
        print(Integer.toBinaryString(i) + " = " + i);
        i <<= 10;
        print(Integer.toBinaryString(i) + " = " + i);

        for (int j = 0; j < 32; j++) {
            i >>>= 1;
            print(Integer.toBinaryString(i) + " = " + i);
        }
    }
}
