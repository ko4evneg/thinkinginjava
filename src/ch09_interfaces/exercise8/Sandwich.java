package ch09_interfaces.exercise8;
//Exercise 8: (2) In polymorphism.Sandwich.java, create an interface called FastFood (with appropriate methods) and
//change Sandwich so that it also implements FastFood.

import static thinkinginjava.util.Utils.print;

interface FastFood {
    void eatFast();
}

class Meal {
    Meal() {
        print("Meal()");
    }
}

class Bread {
    Bread() {
        print("Bread()");
    }
}

class Cheese {
    Cheese() {
        print("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        print("Lettuce()");
    }
}

class Pickle {
    Pickle() {
        print("Pickle()");
    }
}

class Lunch extends Meal {
    Lunch() {
        print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        print("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    //private Pickle p = new Pickle();

    public Sandwich() {
        print("Sandwich()");
    }

    @Override
    public void eatFast() {
        print("FastFood() eating...");
    }

    public static void main(String[] args) {
        new Sandwich().eatFast();
    }
}
