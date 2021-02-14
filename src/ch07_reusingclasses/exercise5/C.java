package ch07_reusingclasses.exercise5;
//Exercise 5: (1) Create two classes, A and B, with default constructors (empty argument
//lists) that announce themselves. Inherit a new class called C from A, and create a member of
//class B inside C. Do not create a constructor for C. Create an object of class C and observe
//the results.

class A {
    public A() {
        System.out.println("A constructor");
    }
}

class B {
    public B() {
        System.out.println("B constructor");
    }
}

public class C extends A {
    private B b = new B();

    public static void main(String[] args) {
        C c = new C();
    }
}
