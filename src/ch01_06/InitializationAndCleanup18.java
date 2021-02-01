package ch01_06;

public class InitializationAndCleanup18 {
    //Exercise 18: (1) Complete the previous exercise by creating objects to attach to the array of references.
    InitializationAndCleanup18(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        InitializationAndCleanup18[] arr;
        arr = new InitializationAndCleanup18[]{new InitializationAndCleanup18("init value")};
    }
}
