package ch11_holdingyourobjects.exercise19;
//Exercise 18: (3) Fill a HashMap with key-value pairs. Print the results to show ordering by hash code. Extract the
//pairs, sort by key, and place the result into a LinkedHashMap. Show that the insertion order is maintained.

//Exercise 19: (2) Repeat the previous exercise with a HashSet and LinkedHashSet.

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import static thinkinginjava.Utils.print;

public class Sets {
    private static HashSet<String> hashSet = new HashSet<>();
    private static LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

    public static void main(String[] args) {
        hashSet.add("Crab");
        hashSet.add("Shrimp");
        hashSet.add("Shark");
        hashSet.add("Fish");
        hashSet.add("Starfish");
        print(hashSet);
        linkedSet.add("Crab");
        linkedSet.add("Shrimp");
        linkedSet.add("Shark");
        linkedSet.add("Fish");
        linkedSet.add("Starfish");
        print(linkedSet);
    }
}
