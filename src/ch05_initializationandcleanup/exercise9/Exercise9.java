package ch05_initializationandcleanup.exercise9;

import static thinkinginjava.util.Utils.print;

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
