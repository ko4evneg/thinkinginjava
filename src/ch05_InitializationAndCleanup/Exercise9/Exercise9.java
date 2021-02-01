package ch05_InitializationAndCleanup.Exercise9;

import static thinkinginjava.Utils.print;

public class Exercise9 {
    public Exercise9() {
        this("str");
        print("Default constructor");
    }
    public Exercise9(String s) {
        print("String constructor");
        print(s);
    }
    public static void main(String[] args) {
        Exercise9 ex = new Exercise9();
    }
}
