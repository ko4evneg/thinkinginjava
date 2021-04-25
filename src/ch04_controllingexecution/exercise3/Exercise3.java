package ch04_controllingexecution.exercise3;
//Exercise 3: (1) Modify Exercise 2 so that your code is surrounded by an “infinite” while loop. It will then run until
//you interrupt it from the keyboard (typically by pressing Control-C).

import java.util.Random;

import static thinkinginjava.util.Utils.print;

public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        for (;;) {
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
