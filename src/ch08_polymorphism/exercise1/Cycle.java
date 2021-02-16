package ch08_polymorphism.exercise1;
//Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Demonstrate that an instance of
//each type can be upcast to Cycle via a ride( ) method.

import static thinkinginjava.Utils.print;

public class Cycle {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
    }


    static void ride(Cycle c){
        print(c.getClass().getSimpleName() + " class");
    }
}

class Unicycle extends Cycle {
    @Override
    public String toString() {
        return "Unicycle";
    }
}

class Bicycle extends Cycle {
    @Override
    public String toString() {
        return "Bicycle";
    }
}

class Tricycle extends Cycle {
    @Override
    public String toString() {
        return "Tricycle";
    }
}
