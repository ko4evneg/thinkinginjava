package ch11_holdingyourobjects.exercise10;
//Exercise 10: (2) Change Exercise 9 in the Polymorphism chapter to use an ArrayList to hold the Rodents and an
//Iterator to move through the sequence of Rodents.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import static thinkinginjava.Utils.print;

public class Rodent {
    public static void main(String[] args) {
        Random random = new Random();
        final int size = 10;
        ArrayList<Rodent> rodents = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            int rand = random.nextInt(3);
            switch (rand) {
                case 0:
                    rodents.add(new Mouse());
                    break;
                case 1:
                    rodents.add(new Gerbil());
                    break;
                case 2:
                    rodents.add(new Hamster());
                    break;
            }
        }
        Iterator it = rodents.iterator();
        while (it.hasNext()) {
            ((Rodent)it.next()).run();
        }
        print("\nWith generic:\n-----------------");
        Iterator<Rodent> itGen = rodents.iterator();
        while (itGen.hasNext()) {
            itGen.next().run();
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