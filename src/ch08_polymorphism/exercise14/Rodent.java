package ch08_polymorphism.exercise14;
//Exercise 14: (4) Modify Exercise 12 so that one of the member objects is a shared object with reference counting,
//and demonstrate that it works properly.

import static thinkinginjava.util.Utils.print;

public class Rodent {
    Hole hole;
    private Paws paws = new Paws("Rodent()");

    public Rodent() {
        print("Constructing Rodent()");
    }

    public Rodent(Hole hole) {
        this.hole = hole;
        hole.addRef();
        print("Constructing Rodent() /w HOle()");
    }

    public static void main(String[] args) {
        Hole hole = new Hole();
        Rodent rodent = new Mouse(hole);
        Rodent rodentTwo = new Gerbil(hole);
        Hamster hamster = new Hamster(hole);
        print(hole.getRefCount());
    }

    void run(){
        print("Running...");
    }
    void chew(){
        print("Chewing...");
    }
}

class Mouse extends Rodent {
    private Paws paws = new Paws("Mouse()");

    public Mouse(Hole hole) {
        super(hole);
        print("Constructing Mouse()");
    }
    @Override
    void run(){
        print("Mouse is running...");
    }
    @Override
    void chew(){
        print("Mouse is chewing...");
    }
}

class Gerbil extends Rodent {
    public Gerbil(Hole hole) {
        super(hole);
        print("Constructing Gerbil()");
    }
    @Override
    void run(){
        print("Gerbil is running...");
    }
    @Override
    void chew(){
        print("Gerbil is chewing...");
    }
}

class Hamster extends Rodent {
    public Hamster(Hole hole) {
        super(hole);
        print("Constructing Hamster()");
    }
    @Override
    void run(){
        print("Hamster is running...");
    }
    @Override
    void chew(){
        print("Hamster is chewing...");
    }
}

class Paws {
    public Paws(String s) {
        print("Adding paws for " + s);
    }
}

class Hole {
    private static long refCount = 0;
    //for objects where Hole is in composition
    private static long references = 0;
    private final long id = references++;

    public Hole() {
        print("Creating a Hole() for creations...");
    }

    public static void addRef(){
        refCount++;
    }

    public static void delRef(){
        refCount--;
    }

    public long getRefCount() {
        return refCount;
    }
}