package ch08_Polymorphism.Exercise10;

//Exercise 10: (3) Create a base class with two methods. In the first method, call the second method.
// Inherit a class and override the second method. Create an object of the derived class, upcast it to
// the base type, and call the first method. Explain what happens.
public class Dishes {
    public static void main(String[] args) {
        Dishes plat = new Cup();
        plat.breaking();
    }
    void breaking() {
        System.out.println("Breaking dishes!");
        this.gathering();
    }

    void gathering() {
        System.out.println("Gathering ceramics!");
    }
}

class Cup extends Dishes {
    @Override
    void gathering() {
        System.out.println("Gathering parts of cup!");
    }
}

