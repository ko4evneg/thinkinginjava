package ch07_ReusingClasses;
//Exercise 19: (2) Create a class with a blank final reference to an object.
// Perform the initialization of the blank final inside all constructors.
// Demonstrate the guarantee that the final must be initialized before use,
// and that it cannot be changed once initialized.

public class Exercise19 {
    public final int i;

    public Exercise19 (int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Exercise19 example = new Exercise19(3);
        System.out.println(example.i);
        //example.i = 5;    //not working
    }
}