package ch04_controllingexecution.exercise10;
//Exercise 10: (5) A vampire number has an EVEN number of digits and is formed by multiplying a pair of numbers
//containing half the number of digits of the result. The digits are taken from the original number in any order.
//Pairs of trailing zeroes are not allowed. Examples include:
//1260 = 21 * 60
//1827 = 21 * 87
//2187 = 27 * 81
//Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)

import static thinkinginjava.util.Utils.print;

public class Exercise10 {
    public static void main(String[] args) {
        for (int k = 1000; k < 10000; k++) {
            String s = String.valueOf(k);
            for (int i = 10; i < 100; i++) {
                for (int j = 10; j < 100; j++) {
                    if (i * j != k)
                        continue;

                    int d1 = i % 10;
                    int d2 = i / 10 % 10;
                    int d3 = j % 10;
                    int d4 = j / 10 % 10;
                    if (s.indexOf(String.valueOf(d1)) < 0|| s.indexOf(String.valueOf(d2)) < 0||
                            s.indexOf(String.valueOf(d3)) < 0|| s.indexOf(String.valueOf(d4)) < 0)
                        continue;

                    s = s.replaceFirst(String.valueOf(d1),"");
                    s = s.replaceFirst(String.valueOf(d2),"");
                    if (s.length() == 3)
                        continue;
                    s = s.replaceFirst(String.valueOf(d3),"");
                    if (s.length() == 2)
                        continue;
                    s = s.replaceFirst(String.valueOf(d4),"");
                    if (s.length() == 1)
                        continue;
                    else
                        print(String.format("%d * %d = %d", i, j, k));
                }
            }
        }
    }
}
