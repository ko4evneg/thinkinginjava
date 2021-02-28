package ch10_innerclasses.exercise23;
//Exercise 23: (4) Create an interface U with three methods. Create a class A with a method that produces a reference
//to a U by building an anonymous inner class. Create a second class B that contains an array of U. B should have one
//method that accepts and stores a reference to a U in the array, a second method that sets a reference in the array
//(specified by the method argument) to null, and a third method that moves through the array and calls the methods in
//U. In main( ), create a group of A objects and a single B. Fill the B with U references produced by the A objects.
//Use the B to call back into all the A objects. Remove some of the U references from the B.

import java.util.Random;

import static thinkinginjava.Utils.print;

interface U {
    void one();

    void two();

    void three();

    String getObjId();
}

class A {
    U getU() {
        return new U() {
            @Override
            public void one() {
                print(getObjId() + ".one();");
            }

            @Override
            public void two() {
                print(getObjId() + ".two();");
            }

            @Override
            public void three() {
                print(getObjId() + ".three();");
            }

            @Override
            public String getObjId() {
                return A.this.getClass().getSimpleName() + "@" + Integer.toHexString(A.this.hashCode()) + ":"
                        + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
            }
        };
    }
}

class B {
    private int size;
    private int i = 0;
    private U[] us;

    public B(int i) {
        this.size = i;
        us = new U[size];
    }

    public void add(U u) {
        if (i >= size) {
            print("Array is full");
            return;
        }
        us[i++] = u;
    }

    public void nullify(int i) {
        if (i >= size) {
            print("Wrong argument");
            return;
        }
        us[i] = null;
    }

    public void iterate() {
        Random r = new Random();
        for (int j = 0; j < i; j++) {
            if (us[j] == null) {
                print(j + " element is NULL");
                continue;
            }
            switch (r.nextInt(3)) {
                case 0:
                    us[j].one();
                    break;
                case 1:
                    us[j].two();
                    break;
                case 2:
                    us[j].three();
                    break;
            }
        }
    }
}

public class Exercise23 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b = new B(9);
        for (int z = 0; z < 3; z++) {
            b.add(a1.getU());
            b.add(a2.getU());
            b.add(a3.getU());
        }
        b.iterate();
        print("\nNullifying...\n");
        b.nullify(4);
        b.nullify(6);
        b.iterate();
    }
}