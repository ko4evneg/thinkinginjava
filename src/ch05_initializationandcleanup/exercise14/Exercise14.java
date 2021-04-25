package ch05_initializationandcleanup.exercise14;
//Exercise 14: (1) Create a class with a static String field that is initialized at the point of definition,
// and another one that is initialized by the static block. Add a static method that prints both fields and
// demonstrates that they are both initialized before they are used.

import static thinkinginjava.util.Utils.print;

public class Exercise14 {
    public static void main(String[] args) {
        Test.outPrint();
    }
}

class Test {
    static String str = "lalaString";
    static String s;

    static {
        s = "staticblockString";
    }

    static void outPrint() {
        print("Init start");
        print(str);
        print(s);
        print("Init end");
    }
}
