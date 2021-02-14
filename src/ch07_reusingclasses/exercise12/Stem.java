package ch07_reusingclasses.exercise12;
//Exercise 12: (3) Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.

import static thinkinginjava.Utils.print;

class Root {
    public Root() {
        print("Root constructed.");
    }

    Component1 compOne = new Component1();
    Component2 compTwo = new Component2();
    Component3 compThree = new Component3();

    public void dispose(){
        print("Root disposed.");
    }
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
        try {

        } finally {
            stem.dispose();
        }
    }

    @Override
    public void dispose(){
        print("Stem disposed.");
        super.dispose();
    }
}
