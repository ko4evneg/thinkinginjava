package ch12_errorhandlingwithexceptions.exercise8;
//Exercise 4: (2) Create your own exception class using the extends keyword. Write a constructor for this class that
//takes a String argument and stores it inside the object with a String reference. Write a method that displays the
//stored String. Create a try-catch clause to exercise your new exception.


//Exercise 8: (1) Write a class with a method that throws an exception of the type created in Exercise 4. Try compiling
//it without an exception specification to see what the compiler says. Add the appropriate exception specification. Try
//out your class and its exception inside a try-catch clause.

import static thinkinginjava.util.Utils.print;

public class MyException extends Exception {
    private String exception;

    public MyException(String exception) {
        super("Super: " + exception);
        this.exception = exception;
    }

    public static void throwEx() throws MyException {
        throw new MyException("My exception occurred!");
    }

    public static void main(String[] args) {
        try {
            MyException.throwEx();
        } catch (MyException myEx) {
            print(myEx.getMessage());
        }
    }
}
