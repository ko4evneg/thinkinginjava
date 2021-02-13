package ch07_reusingclasses.exercise1;
//Exercise 1: (2) Create a simple class. Inside a second class, define a reference to an object of the first class.
//Use lazy initialization to instantiate this object.

public class Exercise1 {
    Exercise1() {
        System.out.println("Constructed");
    }
}
class Second {
    static Exercise1 ex;

    public static void main(String[] args) {
        System.out.println("Start");
        if (ex == null)
            ex = new Exercise1();
    }
}
