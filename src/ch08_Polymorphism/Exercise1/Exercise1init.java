package ch08_Polymorphism.Exercise1;
//Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.

public class Exercise1init {
    public static void main(String[] args) {
        Unicycle uni = new Unicycle();
        Bicycle bic = new Bicycle();
        Tricycle tri = new Tricycle();

        goRide(uni);
        goRide(bic);
        goRide(tri);
    }
    static void goRide (Cycle c) {
        c.ride();
    }
}
class Cycle {
    void ride () {
        System.out.println("Common sense riding");
    }
}

class Unicycle extends Cycle {
    @Override
    void ride () {
        System.out.println("Unicycle riding");
    }
}

class Bicycle extends Cycle {
    @Override
    void ride () {
        System.out.println("Bicycle riding");
    }
}
class Tricycle extends Cycle {
    @Override
    void ride () {
        System.out.println("Tricycle riding");
    }
}


