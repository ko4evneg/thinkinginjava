package ch05_initializationandcleanup.exercise6;
//Exercise 6: (1) Modify the previous exercise so that two of the overloaded methods have two arguments (of two
// different types), but in reversed order relative to each other. Verify that this works.

import static thinkinginjava.Utils.print;

public class Dog {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark("rrr",3);
        dog.bark(3,"rrr");
    }

    void bark (String s, int i) {
        print("barking " + i + " times: " + s + "...");
    }

    void bark (int i, String s) {
        for (int j = 0; j < i; j++) {
            print("barking: " + s + "...");
        }
    }

    void bark (char ch) {
        print("strange barking: " + ch + ch + ch + "...");
    }

    void bark (boolean b) {
        print(b + " barking...");
    }
}
