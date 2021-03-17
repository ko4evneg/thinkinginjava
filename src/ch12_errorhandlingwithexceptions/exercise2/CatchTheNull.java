package ch12_errorhandlingwithexceptions.exercise2;
//Exercise 2: (1) Define an object reference and initialize it to null. Try to call a method through this reference.
//Now wrap the code in a try-catch clause to catch the exception.

public class CatchTheNull {
    public static void main(String[] args) {
        String[] strings = null;
        try {
            strings[0] = "str";
        } catch (NullPointerException e) {
            e.printStackTrace(System.out);
        }
    }
}
