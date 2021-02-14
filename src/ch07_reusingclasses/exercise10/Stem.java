package ch07_reusingclasses.exercise10;
//Exercise 10: (1) Modify the previous exercise so that each class only has non-default constructors.

import static thinkinginjava.Utils.print;

class Root {
    public Root() {
        print("Root constructed.");
    }

    Component1 compOne = new Component1("Root");
    Component2 compTwo = new Component2("Root");
    Component3 compThree = new Component3("Root");
}

class Component1 {
    public Component1(String s) {
        print(s + " Component 1 constructed.");
    }
}

class Component2 {
    public Component2(String s) {
        print(s + " Component 2 constructed.");
    }
}

class Component3 {
    public Component3(String s) {
        print(s + " Component 3 constructed.");
    }
}

public class Stem extends Root {
    Component1 compOne = new Component1("Stem");
    Component2 compTwo = new Component2("Stem");
    Component3 compThree = new Component3("Stem");

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}
