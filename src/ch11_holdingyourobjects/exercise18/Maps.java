package ch11_holdingyourobjects.exercise18;
//Exercise 18: (3) Fill a HashMap with key-value pairs. Print the results to show ordering by hash code. Extract the
//pairs, sort by key, and place the result into a LinkedHashMap. Show that the insertion order is maintained.

import java.util.HashMap;
import java.util.LinkedHashMap;

import static thinkinginjava.util.Utils.print;

public class Maps {
    private static HashMap<String, String> hashMap = new HashMap<>();
    private static HashMap<String, String> linkedMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        hashMap.put("One","Crab");
        hashMap.put("Two","Shrimp");
        hashMap.put("Three","Shark");
        hashMap.put("Four","Fish");
        hashMap.put("Five","Starfish");
        print(hashMap);
        linkedMap.put("One","Crab");
        linkedMap.put("Two","Shrimp");
        linkedMap.put("Three","Shark");
        linkedMap.put("Four","Fish");
        linkedMap.put("Five","Starfish");
        print(linkedMap);
    }
}
