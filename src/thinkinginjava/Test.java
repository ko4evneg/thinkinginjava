package thinkinginjava;

import java.util.*;

import static thinkinginjava.Utils.print;

public class Test {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = { 6, 7, 8, 9, 10 };
        long l = System.nanoTime();
        collection.addAll(Arrays.asList(moreInts));
        print(System.nanoTime()  - l + "\n");
// Runs significantly faster, but you can’t
// construct a Collection this way:
        l = System.nanoTime();
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        print(System.nanoTime() - l + "\n");
        l = System.nanoTime();
        Collections.addAll(collection, moreInts);
        print(System.nanoTime()  - l + "\n");
// Produces a list "backed by" an array:
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99); // OK -- modify an element
        collection.add(21); // Runtime error because the
// underlying array cannot be resized.
    }
}