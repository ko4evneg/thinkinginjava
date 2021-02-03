package ch02_everythingisanobject.exercise6;
//Exercise 6: (2) Write a program that includes and calls the storage( ) method defined as a code fragment in this
// chapter.

public class Exercise6 {
    public static void main(String[] args) {
        String s = "This";
        Exercise6 ex6 = new Exercise6();
        System.out.println(ex6.storage(s) + " bytes");
    }

    int storage(String s) {
        return s.length() * 2;
    }
}
