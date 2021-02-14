package ch07_reusingclasses.exercise15;
//Exercise 15: (2) Create a class inside a package. Your class should contain a protected method. Outside of the
//package, try to call the protected method and explain the results. Now inherit from your class and call the protected
//method from inside a method of your derived class.


import ch07_reusingclasses.exercise15.pkg.Prot;

public class Exercise15 extends Prot {
    public static void main(String[] args) {
        Prot.outMsg();
    }
}
