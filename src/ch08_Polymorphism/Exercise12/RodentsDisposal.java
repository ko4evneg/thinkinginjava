package ch08_Polymorphism.Exercise12;

import java.util.Random;
//Exercise 12: (3) Modify Exercise 9 so that it demonstrates the order of initialization of
// the base classes and derived classes. Now add member objects to both the base and derived
//  classes and show the order in which their initialization occurs during construction.
public class RodentsDisposal {
    int tmp = 1;
    public RodentsDisposal() {
        System.out.println("Rodents creating, " + tmp);
    }
    public static void main(String[] args) {
        RodentsDisposal[] rodents = new RodentsDisposal[1];
        for (int i = 0; i < 1; i++) {
            Random rand = new Random();
            switch (rand.nextInt(1)) {
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
        for (RodentsDisposal rodent : rodents) {
            rodent.run();
        }

    }

    void run() {
        System.out.println("Rodent is running...");
    }
}

class Mouse extends RodentsDisposal {
    int tmp = 2;
    Mouse() {
        System.out.println("Mouse creating");
    }

    void run() {
        System.out.println("Mouse is running...");
    }
}

class Gerbil extends RodentsDisposal {
    public Gerbil() {
        System.out.println("Gerbil creating...");
    }

    void run() {
        System.out.println("Gerbil is running...");
    }
}

class Hamster extends RodentsDisposal {
    public Hamster() {
        System.out.println("Hamster creating...");
    }

    void run() {
        System.out.println("Hamster is running...");
    }
}