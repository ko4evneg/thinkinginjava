package ch09_interfaces.exercise17;
//Exercise 17: (2) Prove that the fields in an interface are implicitly static and final.

import static thinkinginjava.util.Utils.print;

interface StaticAndFinal {
    int i = 52;
}

public class Exercise17 implements StaticAndFinal{
    public static void main(String[] args) {
        print(i);
        //can't:
        //i++;
    }
}
