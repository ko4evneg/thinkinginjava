package ch05_initializationandcleanup.exercise2;
//Exercise 2: (2) Create a class with a String field that is initialized at the point of definition, and another
//one that is initialized by the constructor. What is the difference between the two approaches?

import static thinkinginjava.Utils.print;

public class Exercise2 {
    static String s = "abc";
    static String str;

    Exercise2 (){
        str = "cde";
    }

    public static void main(String[] args) {
        print(s);
        print(str);

        Exercise2 ex2 = new Exercise2();
        print(s);
        print(str);
    }
}
