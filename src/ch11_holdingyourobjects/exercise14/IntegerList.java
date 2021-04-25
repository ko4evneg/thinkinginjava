package ch11_holdingyourobjects.exercise14;
//Exercise 14: (3) Create an empty LinkedList<Integer>. Using a Listlterator, add Integers to the List by always
//inserting them in the middle of the List.

import java.util.*;

import static thinkinginjava.util.Utils.print;

public class IntegerList {
    private static List<Integer> intList = new LinkedList<>();

    public static void main(String[] args) {
        intList.addAll(List.of(5, 6, 7, 8, 9));
        ListIterator lt = intList.listIterator(intList.size() / 2);
        for (int i = 0; i < 3 * 2; i += 2) {
            lt.add(10 + i);
            print((10 + i) + ":" + intList);
            lt.add(11 + i);
            print((11 + i) + ":" + intList);
            lt.previous();
        }
    }
}
