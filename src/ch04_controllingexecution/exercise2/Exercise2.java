package ch04_controllingexecution.exercise2;
//Exercise 2: (2) Write a program that generates 25 random int values. For each value, use an if-else statement to
//classify it as greater than, less than, or equal to a second randomly generated value.

import java.util.Random;

import static thinkinginjava.Utils.print;

public class Exercise2 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            if (a < b)
                print("a < b: " + a + " < " + b);
            else if (a > b)
                print("a > b: " + a + " > " + b);
            else
                print("a = b: " + a + " = " + b);

        }
    }
}
