package ch07_reusingclasses.exercise7;
//Exercise 7: (1) Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors.
//Write a constructor for C and perform all initialization within C’s constructor.

class A {
    public A(int i) {
        System.out.println("A constructor: " + i);
    }
}

class B {
    public B(int i) {
        System.out.println("B constructor: " + i);
    }
}

public class C extends A {
    private B b;

    public C() {
        super(3);
        this.b = new B(5);
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
