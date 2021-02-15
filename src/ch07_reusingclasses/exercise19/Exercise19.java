package ch07_reusingclasses.exercise19;
//Exercise 19: (2) Create a class with a blank final reference to an object. Perform the initialization of the blank
//final inside all constructors. Demonstrate the guarantee that the final must be initialized before use, and that it
//cannot be changed once initialized.

public class Exercise19 {
    final Exercise19 ex;

    public Exercise19() {
        ex = new Exercise19();
    }

    public static void main(String[] args) {
        // Can't compile:
        // ex = new Exercise19();
    }
}
