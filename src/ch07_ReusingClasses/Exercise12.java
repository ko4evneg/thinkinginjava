package ch07_ReusingClasses;
//Exercise 12: (3) Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.
public class Exercise12 {
    public static void main(String[] args) {
        Exercise12 ex12 = new Exercise12();
        ex12.new Stem().dispose();
    }

    class Root {
        Component1 comp1 = new Component1();
        Component2 comp2 = new Component2();
        Component3 comp3 = new Component3();
        
        public void dispose() {
            comp1 = null;
            comp2 = null;
            comp3 = null;
            System.out.println("Root disposal");
        }
    }

    class Stem extends Root {
        Component1 comp1 = new Component1();
        Component2 comp2 = new Component2();
        Component3 comp3 = new Component3();
        public void dispose() {
            comp1 = null;
            comp2 = null;
            comp3 = null;
            System.out.println("Stem disposal");
            super.dispose();
        }
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
