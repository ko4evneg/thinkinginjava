package ch01_06;

public class InitializationAndCleanup15 {
    //    Exercise 15: (1) Create a class with a String that is initialized using instance initialization.
    String str;
    {
        str = "la stringa";
    }

    @Override
    public String toString() {
        return "This is an object!";
    }

    public static void main(String[] args) {
        InitializationAndCleanup15 str = new InitializationAndCleanup15();
        System.out.println(str.str);
        System.out.println(str);
    }
}
