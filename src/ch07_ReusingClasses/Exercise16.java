package ch07_ReusingClasses;
//Exercise 16: (2) Create a class called Amphibian. From this, inherit a class called Frog.
//Put appropriate methods in the base class. In main( ), create a Frog and upcast it
//to Amphibian and demonstrate that all the methods still work.

public class Exercise16 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.print(frog);
    }
}

class Amphibian {
    protected String name;
    void print (Amphibian am) {
        System.out.println("That's amphibia " + am.name);
    }
}

class Frog extends Amphibian {
    Frog() {
        super.name = "la frogga";
    }
}