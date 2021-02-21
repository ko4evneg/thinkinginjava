package ch09_interfaces.exercise3;
//Exercise 3: (2) Create a base class with an abstract print( ) method that is overridden in a derived class. The
//overridden version of the method prints the value of an int variable defined in the derived class. At the point of
//definition of this variable, give it a nonzero value. In the base-class constructor, call this method. In main( ),
//create an object of the derived type, and then call its print( ) method. Explain the results.

import thinkinginjava.Utils;

abstract class Printer {
    abstract void print();

    public Printer() {
        //Call for overridden method, though i isn't initialized yet.
        print();
    }
}

public class Exercise3 extends Printer{
    private int i = 5;
    //Compile-time value
    final private int j = 3;

    @Override
    void print() {
        Utils.print(i);
        Utils.print(j);
    }

    public static void main(String[] args) {
        Exercise3 ex = new Exercise3();
        Utils.print("-----------");
        ex.print();
    }
}
