package ch07_ReusingClasses;
//Exercise 13: (2) Create a class with a method that is overloaded three times. Inherit a new class,
//add a new overloading of the method, and show that all four methods are available in the derived class.

public class Exercise13 {
    public static void main(String[] args) {
        Exercise14 ex = new Exercise14();
        ex.resolve(2);
        ex.resolve(3d);
    }

    void resolve() {
        System.out.println("Resolving exercise 13");
    }

    void resolve (String s) {
        System.out.println("Resolving exercise " + s);
    }

    void resolve (double i) {
        System.out.printf("Resolving exercise %.4f\n", i);
    }

    private static class Exercise14 extends Exercise13 {
        void resolve(int i) {
            System.out.println("Resolving exercise 14");
        }
    }
}
