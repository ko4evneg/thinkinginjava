package ch07_reusingclasses.exercise21;
//Exercise 21: (1) Create a class with a final method. Inherit from that class and attempt to overwrite that method.

class Base {
    final void print() {
        System.out.println("final ex21");
    }
}

public class Exercise21 extends Base {
    /* Can't override!
    void print() {
        System.out.println("Override test");
    }*/

    public static void main(String[] args) {
        new Exercise21().print();
    }
}


