package ch01_06;

public class InitializationAndCleanup16 {
//Exercise 16: (1) Create an array of String objects and assign a String to each element. Print the array by using a for loop.

    public static void main(String[] args) {
        String[] strs = {"abba","prodigy","nirvana"};
        for (String s : strs)
            System.out.println(s);
    }
}
