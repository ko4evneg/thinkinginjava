package ch05_initializationandcleanup.exercise19;
//Exercise 19: (2) Write a method that takes a vararg String array. Verify that you can pass either a
//comma-separated list of Strings or a String[] into this method.

import static thinkinginjava.util.Utils.print;

public class Exercise19 {
    public static void main(String[] args) {
        String[] strs = new String[5];
        for (int i = 1; i <= 5; i++) {
            String s = String.valueOf(i);
            strs[i - 1] = s;
        }

        stringer(strs);
        print("------------");
        stringer("a","b","c","d");
    }

    static void stringer(String...strs) {
        for (String s : strs) {
            print(s);
        }
    }
}
