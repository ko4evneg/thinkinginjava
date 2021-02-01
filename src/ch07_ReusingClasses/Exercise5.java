package ch07_ReusingClasses;
//Exercise 5: (1) Create two classes, A and B, with default constructors (empty argument lists)
// that announce themselves. Inherit a new class called C from A, and create a member of class B inside C.
// Do not create a constructor for C. Create an object of class C and observe the results.


public class Exercise5 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    int b = 2;
    A() {
        System.out.println("A constructor!");
    }
}

class B {
    B() {
        System.out.println("B constructor!");
    }
}

class C extends A {
    int a = 1;
    private B b = new B();
}
