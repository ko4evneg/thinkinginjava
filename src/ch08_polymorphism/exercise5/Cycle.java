package ch08_polymorphism.exercise5;
//Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of wheels. Modify
//ride( ) to call wheels( ) and verify that polymorphism works.

import static thinkinginjava.util.Utils.print;

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
        print(c.getClass().getSimpleName() + " has " + c.wheels() + " wheels.");
    }
    int wheels(){
        return -1;
    }
}

class Unicycle extends Cycle {
    @Override
    public String toString() {
        return "Unicycle";
    }

    @Override
    int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    @Override
    public String toString() {
        return "Bicycle";
    }
    @Override
    int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    @Override
    public String toString() {
        return "Tricycle";
    }
    @Override
    int wheels() {
        return 3;
    }
}
