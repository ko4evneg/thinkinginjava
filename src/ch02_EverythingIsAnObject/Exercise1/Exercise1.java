package ch02_EverythingIsAnObject.Exercise1;
//Exercise 1: (2) Create a class containing an int and a char that are not initialized,
// and print their values to verify that Java performs default initialization.
public class Exercise1 {
    static int i;
    static char a;

    public static void main(String[] args) {
        System.out.println("char: " + a);
        System.out.println("int: " + i);
    }
}
