package ch08_polymorphism.exercise17;
//Exercise 1: Exercise 17: (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle and
//Bicycle, but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle. Try to call
//balance( ) on each element of the array and observe the results. Downcast and call balance( ) and observe what happens.
import static thinkinginjava.util.Utils.print;

public class Cycle {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle[] cycles = new Cycle[]{unicycle, bicycle, tricycle};
        ((Unicycle) cycles[0]).balance();
        ((Bicycle) cycles[1]).balance();
        //((Tricycle) cycles[2]).balance();
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

    public void balance(){print("Unibalance");}
}

class Bicycle extends Cycle {
    @Override
    public String toString() {
        return "Bicycle";
    }

    public void balance(){print("Bibalance");}
}

class Tricycle extends Cycle {
    @Override
    public String toString() {
        return "Tricycle";
    }
}
