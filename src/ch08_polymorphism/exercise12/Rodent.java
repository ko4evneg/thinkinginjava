package ch08_polymorphism.exercise12;
//Exercise 12: (3) Modify Exercise 9 so that it demonstrates the order of initialization of the base classes and
//derived classes. Now add member objects to both the base and derived classes and show the order in which their
//initialization occurs during construction.

import java.util.Random;

import static thinkinginjava.Utils.print;

public class Rodent {
    private Paws paws = new Paws("Rodent()");

    public Rodent() {
        print("Constructing Rodent()");
    }

    public static void main(String[] args) {
        Rodent rOne = new Mouse();
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

    public Mouse() {
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
    public Gerbil() {
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
    public Hamster() {
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