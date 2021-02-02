package ch05_InitializationAndCleanup.Exercise16;
//Exercise 16: (1) Create an array of String objects and assign a String to each element.
//Print the array by using a for loop.

import static thinkinginjava.Utils.print;

public class Exercise16 {
    public static void main(String[] args) {
        String [] strs = new String[10];
        for (String s : strs) {
            print(s);
        }
        for (int i = 0; i < 10; i++) {
            strs[i] = "new str " + i;
        }
        for (String s : strs) {
            print(s);
        }
    }
}
