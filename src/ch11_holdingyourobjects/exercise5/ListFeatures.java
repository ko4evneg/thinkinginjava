package ch11_holdingyourobjects.exercise5;
//Exercise 5: (3) Modify ListFeatures.java so that it uses Integers (remember autoboxing!) instead of numbers,
//and explain any difference in results.

import java.util.*;

import static thinkinginjava.Utils.print;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(new Integer[]{4, 7, 1, 12, 20, 520, 9}));
        print("1: " + numbers);
        Integer h = 1;
        numbers.add(h); // Automatically resizes
        print("2: " + numbers);
        print("3: " + numbers.contains(h));
        print("3a: " + numbers.contains(1f));
        numbers.remove(h); // Remove by object
        Integer p = numbers.get(2);
        print("4: p = " + p + " index:" + numbers.indexOf(p));
        //Difference, because equals() shows equality:
        Integer ln = Integer.valueOf(520);
        print("5: " + numbers.indexOf(ln));
        print("6: " + numbers.remove(ln));
// Must be the exact object:
        print("7: " + numbers.remove(p));
        print("8: " + numbers);
        numbers.add(13); // Insert at an index
        print("9: " + numbers);
        List<Integer> sub = numbers.subList(4, 6);
        print("subList: " + sub);
        print("10: " + numbers.containsAll(sub));
        Collections.sort(sub); // In-place sort
        print("sorted subList: " + sub);
// Order is not important in containsAll():
        print("11: " + numbers.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        print("shuffled subList: " + sub);
        print("12: " + numbers.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(numbers);
        sub = Arrays.asList(numbers.get(1), numbers.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<Integer>(numbers); // Get a fresh copy
        copy.remove(2); // Remove by index
        print("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        print("15: " + copy);
        copy.set(1, new Integer(1)); // Replace an element
        print("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        print("17: " + copy);
        print("18: " + numbers.isEmpty());
        numbers.clear(); // Remove all elements
        print("19: " + numbers);
        print("20: " + numbers.isEmpty());
        numbers.addAll(Arrays.asList(new Integer[]{101,102,103,104}));
        print("21: " + numbers);
        Object[] o = numbers.toArray();
        print("22: " + o[3]);
        Integer[] pa = numbers.toArray(new Integer[0]);
        print("23: " + pa[3]);
    }
}