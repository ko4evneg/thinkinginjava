package ch04_controllingexecution.exercise4;
//Exercise 4: (3) Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime
//numbers (integral numbers that are not evenly divisible by any other numbers except for themselves and 1).

import static thinkinginjava.util.Utils.print;

public class Exercise4 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            print(i);
        }
    }
}
