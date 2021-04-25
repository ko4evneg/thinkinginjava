package ch07_reusingclasses.exercise9;
//Exercise 9: (2) Create a class called Root that contains an instance of each of the classes (that you also create)
//named Component1, Component2, and Component3. Derive a class Stem from Root that also contains an instance of each
//“component.” All classes should have default constructors that print a message about that class.

import static thinkinginjava.util.Utils.print;

class Root {
    public Root() {
        print("Root constructed.");
    }

    Component1 compOne = new Component1();
    Component2 compTwo = new Component2();
    Component3 compThree = new Component3();
}

class Component1 {
    public Component1() {
        print("Component 1 constructed.");
    }
}

class Component2 {
    public Component2() {
        print("Component 2 constructed.");
    }
}

class Component3 {
    public Component3() {
        print("Component 3 constructed.");
    }
}

public class Stem extends Root {
    Component1 compOne = new Component1();
    Component2 compTwo = new Component2();
    Component3 compThree = new Component3();

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}
