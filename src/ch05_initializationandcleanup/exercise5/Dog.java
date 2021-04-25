package ch05_initializationandcleanup.exercise5;
//Exercise 5: (2) Create a class called Dog with an overloaded bark( ) method. This method should be overloaded based
// on various primitive data types, and print different types of barking, howling, etc., depending on which overloaded
// version is called. Write a main( ) that calls all the different versions.

import static thinkinginjava.util.Utils.print;

public class Dog {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(3);
        dog.bark("grh-grh");
        dog.bark('r');
        dog.bark(true);
    }

    void bark (String s) {
        print("barking: " + s + "...");
    }

    void bark (int i) {
        for (int j = 0; j < i; j++) {
            print("barking...");
        }
    }

    void bark (char ch) {
        print("strange barking: " + ch + ch + ch + "...");
    }

    void bark (boolean b) {
        print(b + " barking...");
    }
}
