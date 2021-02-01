package ch04_ControllingExecution.Exercise9;
//Exercise 9: (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, where each
//number (from the third on) is the sum of the previous two. Create a method that takes an integer as an argument and
//displays that many Fibonacci numbers starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci
//is the name of the class) the output will be: 1, 1, 2, 3, 5.

import static thinkinginjava.Utils.print;

public class Exercise9 {
    public static void main(String[] args) {
        display(34);
    }

    static void display(int i) {
        int prev = 1;
        int next = 1;
        int afterNext = 2;
        while (prev <= i) {
            afterNext = prev + next;
            print(prev);
            prev = next;
            next = afterNext;
        }
    }
}
