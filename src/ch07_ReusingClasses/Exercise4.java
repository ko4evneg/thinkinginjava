package ch07_ReusingClasses;
//Exercise 4: (2) Prove that the base-class constructors are (a) always called and (b) called before derived-class constructors.

public class Exercise4 {
    public static void main(String[] args) {
        Child baby = new Child();
    }
}

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
}

class GrandChild extends Child {

}

