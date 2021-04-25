package ch11_holdingyourobjects.exercise23;
//Exercise 23: (4) Starting with Statistics.java, create a program that runs the test repeatedly and looks to see if any
//one number tends to appear more than the others in the results.

import java.util.*;

import static thinkinginjava.util.Utils.print;

public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        ArrayList<Map<Integer, Integer>> maps = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Map<Integer, Integer> m =
                    new HashMap<Integer, Integer>();
            for (int j = 0; j < 10000; j++) {
// Produce a number between 0 and 20:
                int r = rand.nextInt(20);
                Integer freq = m.get(r);
                m.put(r, freq == null ? 1 : freq + 1);
            }
            maps.add(m);
        }
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (Map<Integer, Integer> map : maps) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int count = m.getOrDefault(entry.getKey(), entry.getValue());
                m.put(entry.getKey(), count + entry.getValue());
            }
        }
        List<Map.Entry<Integer, Integer>> tempList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            m.put(e.getKey(), e.getValue() / 10);
        }
        print(m);
    }
}