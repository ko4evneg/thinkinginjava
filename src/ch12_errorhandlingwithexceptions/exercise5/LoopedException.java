package ch12_errorhandlingwithexceptions.exercise5;
//Exercise 5: (3) Create your own resumption-like behavior using a while loop that repeats until an exception is no
//longer thrown.

import java.util.Random;

import static thinkinginjava.Utils.print;

public class LoopedException {
    private static Random random = new Random();

    public static void main(String[] args) {
        int counter = 0;
        Exception exc = null;
        while (true) {
            try {
                int rand = random.nextInt(150);
                counter++;
                if (rand <= 140)
                    rand /= 0;
                else
                    break;
            } catch (ArithmeticException e) {
                exc = e;
            }
        }
        print("Try: " + counter);
        print(exc);
    }
}
