package ch12_errorhandlingwithexceptions.exercise4;
//Exercise 4: (2) Create your own exception class using the extends keyword. Write a constructor for this class that
//takes a String argument and stores it inside the object with a String reference. Write a method that displays the
//stored String. Create a try-catch clause to exercise your new exception.

import static thinkinginjava.Utils.print;

public class MyException extends Exception {
    private String exception;

    public MyException(String exception) {
        this.exception = exception;
    }

    public void getError(){
        print(exception);
    }

    public static void main(String[] args) {
        try {
            throw new MyException("My exception occured!");
        } catch (MyException e) {
            e.getError();
        }
    }
}
