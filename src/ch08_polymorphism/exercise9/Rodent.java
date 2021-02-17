package ch08_polymorphism.exercise9;
//Exercise 9: (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class, provide
//methods that are common to all Rodents, and override these in the derived classes to perform different behaviors
//depending on the specific type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents,
//and call your base-class methods to see what happens.

import java.util.Random;

import static thinkinginjava.Utils.print;

public class Rodent {
    public static void main(String[] args) {
        Random random = new Random();
        Rodent[] rodents = new Rodent[10];
        for (int i = 0; i < rodents.length; i++) {
            int rand = random.nextInt(3);
            switch (rand) {
                case 0:
                    rodents[i] = new Mouse();
                    break;
                case 1:
                    rodents[i] = new Gerbil();
                    break;
                case 2:
                    rodents[i] = new Hamster();
                    break;
            }
        }
        for (Rodent rodent : rodents) {
            rodent.run();
        }

    }

    void run(){
        print("Running...");
    }
    void chew(){
        print("Chewing...");
    }
}

class Mouse extends Rodent {
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
    @Override
    void run(){
        print("Hamster is running...");
    }
    @Override
    void chew(){
        print("Hamster is chewing...");
    }
}