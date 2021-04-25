package ch11_holdingyourobjects.exercise17;
//Exercise 17: (2) Take the Gerbil class in Exercise 1 and put it into a Map instead, associating each Gerbil’s name
//(e.g. "Fuzzy" or "Spot") as a String (the key) for each Gerbil (the value) you put in the table. Get an Iterator for
//the keySet( ) and use it to move through the Map, looking up the Gerbil for each key and printing out the key and
//telling the Gerbil to hop( ).

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
        Map<String, Gerbil> gerbils = new HashMap<>();
        gerbils.put("Crokee",new Gerbil());
        gerbils.put("Ruby",new Gerbil());
        gerbils.put("Loka",new Gerbil());
        gerbils.put("Tar",new Gerbil());
        gerbils.put("Arsa",new Gerbil());

        Iterator<String> it = gerbils.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            print(key);
            gerbils.get(key).hop();
        }
    }
}
