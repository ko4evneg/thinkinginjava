package ch07_ReusingClasses;
//Exercise 9: (2) Create a class called Root that contains an instance of each of the classes
//        (that you also create) named Component1, Component2, and Component3. Derive a class
//Stem from Root that also contains an instance of each “component.” All classes should have
//default constructors thatt print a message about that class.
public class Exercise9 {
    public static void main(String[] args) {
        Exercise9 ex9 = new Exercise9();
        ex9.new Stem();
    }

    class Root {
        Component1 comp1 = new Component1();
        Component2 comp2 = new Component2();
        Component3 comp3 = new Component3();
    }

    class Stem extends Root {
        Component1 comp1 = new Component1();
        Component2 comp2 = new Component2();
        Component3 comp3 = new Component3();
    }

    class Component1 {
        public Component1() {
            System.out.println("new c1");
        }
    }
    class Component2 {
        public Component2() {
            System.out.println("new c2");
        }
    }
    class Component3 {
        public Component3() {
            System.out.println("new c3");
        }
    }
}
