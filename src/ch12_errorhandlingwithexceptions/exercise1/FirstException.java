package ch12_errorhandlingwithexceptions.exercise1;
//Exercise 1: (2) Create a class with a main( ) that throws an object of class Exception inside a try block. Give the
//constructor for Exception a String argument. Catch the exception inside a catch clause and print the String argument.
//Add a finally clause and print a message to prove you were there.

import static thinkinginjava.Utils.print;

public class FirstException {
    public static void main(String[] args) {
        try {
            throw new Exception("My first exception");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            print("Finally block");
        }
    }
}
