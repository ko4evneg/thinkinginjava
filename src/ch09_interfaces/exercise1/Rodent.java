package ch09_interfaces.exercise1;
//Exercise 1: (1) Modify Exercise 9 in the previous chapter so that Rodent is an abstract class. Make the methods of
//Rodent abstract whenever possible.

import java.util.Random;

import static thinkinginjava.util.Utils.print;

public abstract class Rodent {
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

    abstract void run();
    abstract void chew();
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