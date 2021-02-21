package ch_09_interfaces.exercise7;
//Exercise 7: (1) Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.

import java.util.Random;

import static thinkinginjava.Utils.print;

interface Rodent {
    void run();
    void chew();
}

class Mouse implements Rodent {
    @Override
    public void run(){
        print("Mouse is running...");
    }
    @Override
    public void chew(){
        print("Mouse is chewing...");
    }
}

class Gerbil implements Rodent {
    @Override
    public void run(){
        print("Gerbil is running...");
    }
    @Override
    public void chew(){
        print("Gerbil is chewing...");
    }
}

class Hamster implements Rodent {
    @Override
    public void run(){
        print("Hamster is running...");
    }
    @Override
    public void chew(){
        print("Hamster is chewing...");
    }
}

public class Exercise7 {
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
}