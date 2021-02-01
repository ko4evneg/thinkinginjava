package ch03_Operators.Exercise10;

import static thinkinginjava.Utils.print;

//Exercise 10: (3) Write a program with two constant values, one with alternating binary ones and zeroes, with a zero in
//the least-significant digit, and the second, also alternating, with a one in the least-significant digit (hint: It’s
//easiest to use hexadecimal constants for this). Take these two values and combine them in all possible ways using the
//bitwise operators, and display the results using Integer.toBinaryString( ).

public class Exercise10 {
    public static void main(String[] args) {
        int i = 0b10101010;
        long l = 0b11101010;
        print("i = " + i);
        print("l = " + l);

        print(String.format("NOT i: %s\n" +
                "i XOR l: %10s\n" +
                "i AND l: %10s\n" +
                "i OR l: %10s\n", Long.toBinaryString(~i & 0b11111111), Long.toBinaryString(i ^ l), Long.toBinaryString(i & l), Long.toBinaryString(i | l)));
    }
}
