package ch03_Operators.Exercise7;
//Exercise 7: (3) Write a program that simulates coin-flipping.

import java.util.Random;
import static thinkinginjava.Utils.print;

public class CoinFlip {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2);
        boolean b = i == 1;
        if (b)
            print("Face side");
        else
            print("Back side");
    }
}
