package ch01_06;
//Exercise 19: (2) Write a method that takes a vararg String array.
//Verify that you can pass either a comma-separated list of Strings or a String[] into this method.

public class InitializationAndCleanup19 {
    public static void main(String[] args) {
        System.out.println("String:");
        vararg("a","b","c");
        System.out.println("String[]:");
        vararg(new String[]{"a","b","c"});
    }

    public static void vararg (String...strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
