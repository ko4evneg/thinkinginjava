package ch08_Polymorphism.Exercise9;

import java.util.Random;

//Exercise 9: (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class,
//provide methods that are common to all Rodents, and override these in the derived classes to perform
//different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with
//different specific types of Rodents, and call your base-class methods to see what happens.
public class Rodents {
    public static void main(String[] args) {
        Rodents[] rodents = new Rodents[10];
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            switch (rand.nextInt(3)) {
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
        for (Rodents rodent : rodents) {
            rodent.run();
        }

    }
    void run() {
        System.out.println("Rodent is running...");
    }
}

class Mouse extends Rodents {
    void run() {
        System.out.println("Mouse is running...");
    }
}

class Gerbil extends Rodents {
    void run() {
        System.out.println("Gerbil is running...");
    }
}

class Hamster extends Rodents {
    void run() {
        System.out.println("Hamster is running...");
    }
}