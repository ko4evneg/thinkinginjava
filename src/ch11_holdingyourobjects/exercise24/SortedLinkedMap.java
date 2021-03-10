package ch11_holdingyourobjects.exercise24;
//Exercise 24: (2) Fill a LinkedHashMap with String keys and objects of your choice. Now extract the pairs, sort them
//based on the keys, and reinsert them into the Map.

import java.util.*;

import static thinkinginjava.Utils.print;

public class SortedLinkedMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        fill(map);
        List<String> sortedList = new ArrayList<>(map.keySet());
        Collections.sort(sortedList, String.CASE_INSENSITIVE_ORDER);
        for (String s : sortedList) {
            sortedMap.put(s, map.get(s));
        }
        print(map);
        print(sortedMap);
    }

    private static void fill(Map<String, Integer> m) {
        m.put("crab", 24);
        m.put("fish", 37);
        m.put("shrimp", 4);
        m.put("shark", 201);
        m.put("oyster", 50);
        m.put("jellyfish", 300);
        m.put("whale", 99);

    }
}
