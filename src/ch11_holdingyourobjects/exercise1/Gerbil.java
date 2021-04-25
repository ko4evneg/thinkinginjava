package ch11_holdingyourobjects.exercise1;
//Exercise 1: (2) Create a new class called Gerbil with an int gerbilNumber that’s initialized in the constructor. Give
//it a method called hop( ) that displays which gerbil number this is, and that it’s hopping. Create an ArrayList and
//add Gerbil objects to the List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.

import java.util.ArrayList;

import static thinkinginjava.util.Utils.print;

public class Gerbil {
    private static int count = 1;
    private int gerbilNumber;

    public Gerbil() {
        gerbilNumber = count++;
    }

    public void hop() {
        print("Gerbil " + gerbilNumber + " hopping...");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            gerbils.add(new Gerbil());
        }

        for (int i = 0; i < 5; i++) {
            gerbils.get(i).hop();
        }
    }
}
