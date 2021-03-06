package ch08_polymorphism.exercise11;
//Exercise 11: (1) Add class Pickle to Sandwich.java.
import static thinkinginjava.util.Utils.print;

class Meal {
    Meal() { print("Meal()"); }
}
class Bread {
    Bread() { print("Bread()"); }
}
class Cheese {
    Cheese() { print("Cheese()"); }
}
class Lettuce {
    Lettuce() { print("Lettuce()"); }
}

class Pickle {
    Pickle() { print("Pickle()"); }
}
class Lunch extends Meal {
    Lunch() { print("Lunch()"); }
}
class PortableLunch extends Lunch {
    PortableLunch() { print("PortableLunch()");}
}
public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    //private Pickle p = new Pickle();

    public Sandwich() { print("Sandwich()"); }
    public static void main(String[] args) {
        new Sandwich();
    }
}
