package ch08_polymorphism.exercise13;
//Exercise 13: (3) Add a finalize( ) method to ReferenceCounting.java to verify the termination condition (see the
//Initialization & Cleanup chapter).

import static thinkinginjava.util.Utils.print;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        print("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0)
            print("Disposing " + this);
    }

    public String toString() {
        return "Shared " + id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Trying to finalize " + this);
        if (--refcount != 0)
            System.out.println("Cannot finalize " + this);
        else System.out.println("Successfully finalized " + this);
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Trying to finalize " + this + " which includes " + shared);
        shared.finalize();
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)};
        for (Composing c : composing)
            c.dispose();
    }
}