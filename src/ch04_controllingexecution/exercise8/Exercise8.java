package ch04_controllingexecution.exercise8;

import static thinkinginjava.util.Utils.print;

//Exercise 8: (2) Create a switch statement that prints a message for each case, and put the switch inside a for loop
//that tries each case. Put a break after each case and test it, then remove the breaks and see what happens.

public class Exercise8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    print("One");
                    break;
                case 2:
                    print("Two");
                    break;
                case 3:
                    print("Three");
                    break;
            }
        }
    }
}
