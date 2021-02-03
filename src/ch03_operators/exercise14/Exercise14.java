package ch03_operators.exercise14;
//Exercise 14: (3) Write a method that takes two String arguments and uses all the boolean comparisons to compare the
//two Strings and print the results. For the == and !=, also perform the equals( ) test. In main( ), call your method
//with some different String objects.

import static thinkinginjava.Utils.print;

public class Exercise14 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = "abc";
        String s4 = new String("abc");

        print(String.format("s1 == s2: %b",s1 == s2));
        print(String.format("s1 == s3: %b",s1 == s3));
        print(String.format("s1 == s4: %b",s1 == s4));
        print(String.format("s1 equals s2: %b",s1.equals(s2)));
        print(String.format("s1 equals s3: %b",s1.equals(s3)));
        print(String.format("s1 equals s4: %b",s1.equals(s4)));
    }


}
