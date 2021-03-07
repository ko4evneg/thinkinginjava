package ch11_holdingyourobjects.exercise11;
//Exercise 11: (2) Write a method that uses an Iterator to step through a Collection and print the toString( ) of each
//object in the container. Fill all the different types of Collections with objects and apply your method to each
//container.

import java.util.*;

import static thinkinginjava.Utils.print;

public class DisplayCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3));
        Set<Integer> set = new HashSet<>(List.of(4,5,6));
        Queue<Integer> queue = new PriorityQueue<>(List.of(7,8,9));
        displayCollection(list);
        displayCollection(set);
        displayCollection(queue);
    }

    public static void displayCollection(Collection c) {
        Iterator it = c.iterator();
        while (it.hasNext())
            print(it.next());
        print("");
    }
}
