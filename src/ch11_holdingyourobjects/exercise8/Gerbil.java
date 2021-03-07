package ch11_holdingyourobjects.exercise8;
//Exercise 8: (1) Modify Exercise l so it uses an Iterator to move through the List while calling hop( ).

import java.util.ArrayList;
import java.util.Iterator;

import static thinkinginjava.Utils.print;

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

        Iterator<Gerbil> it = gerbils.iterator();

        while (it.hasNext()) {
            it.next().hop();
        }
    }
}
