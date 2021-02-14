package ch07_reusingclasses.exercise8;

//Exercise 8: (1) Create a base class with only a non-default constructor, and a derived class with both a default
//(no-arg) and non-default constructor. In the derived-class constructors, call the base-class constructor.

import static thinkinginjava.Utils.print;

class Base {
    public Base(String s) {
        print("Base constructor says: " + s);
    }
}
public class Exercise8 extends Base {
    public Exercise8() {
        super("no_data");
        print("Ex8 obj w/o data");
    }

    public Exercise8(String s) {
        super(s);
        print("Ex8 obj /w data");
    }

    public static void main(String[] args) {
        Exercise8 one = new Exercise8();
        print("----");
        Exercise8 two = new Exercise8("data_string");
    }
}
