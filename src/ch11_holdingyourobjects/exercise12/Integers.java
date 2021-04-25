package ch11_holdingyourobjects.exercise12;
//Exercise 12: (3) Create and populate a List<Integer>. Create a second List<Integer> of the same size as the first, and
//use ListIterators to read elements from the first List and insert them into the second in reverse order. (You may want
//to explore a number of different ways to solve this problem.)

import java.util.*;

import static thinkinginjava.util.Utils.print;

public class Integers {
    private static List<Integer> integers = new ArrayList<>();
    private static List<Integer> copy;

    public static void main(String[] args) {
        integers.addAll(List.of(1,2,3,4,5));
        copy = new ArrayList<>(integers.size());
        ListIterator<Integer> integersIterator = integers.listIterator(integers.size());

        while (integersIterator.hasPrevious()) {
            copy.add(integersIterator.previous());
        }

        print(integers);
        print(copy);
    }
}
