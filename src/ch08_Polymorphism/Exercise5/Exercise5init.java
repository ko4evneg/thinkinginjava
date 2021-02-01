package ch08_Polymorphism.Exercise5;
//Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle,
// which returns the number of wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.

public class Exercise5init {
    public static void main(String[] args) {
        Unicycle uni = new Unicycle();
        Bicycle bic = new Bicycle();
        Tricycle tri = new Tricycle();

        Cycle c = new Cycle();
        c.ride(uni);
        c.ride(bic);
        c.ride(tri);
    }

    static void goRide(Cycle c) {
        c.ride(c);
    }
}

class Cycle {
    void ride(Cycle c) {
        System.out.println("Wheels: " + c.wheels());
    }

    int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {
    @Override
    void ride(Cycle c) {
        System.out.println("Unicycle riding");
    }

    @Override
    int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    @Override
    void ride(Cycle c) {
        System.out.println("Bicycle riding");
    }

    @Override
    int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    @Override
    void ride(Cycle c) {
        System.out.println("Tricycle riding");
    }

    @Override
    int wheels() {
        return 3;
    }
}


