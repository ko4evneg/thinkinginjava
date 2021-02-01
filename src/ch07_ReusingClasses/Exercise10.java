package ch07_ReusingClasses;

//Exercise 10: (1) Modify the previous exercise so that each class only has non-default constructors.
public class Exercise10 {
    public static void main(String[] args) {
        Exercise10 ex9 = new Exercise10();
        ex9.new Stem();
    }

    class Root {
        Component1 comp1 = new Component1(01);
        Component2 comp2 = new Component2(02);
        Component3 comp3 = new Component3(03);
    }

    class Stem extends Root {
        Component1 comp1 = new Component1(10);
        Component2 comp2 = new Component2(20);
        Component3 comp3 = new Component3(30);
    }

    class Component1 {
        public Component1(int i) {
            System.out.println("new c" + i);
        }
    }

    class Component2 {
        public Component2(int i) {
            System.out.println("new c" + i);
        }
    }

    class Component3 {
        public Component3(int i) {
            System.out.println("new c" + i);
        }
    }
}
