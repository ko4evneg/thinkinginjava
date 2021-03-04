package ch11_holdingyourobjects.exercise2;
//Exercise 2: (1) Modify SimpleCollection.java to use a Set for c.

import java.util.*;

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for(Integer i : c)
            System.out.print(i + ", ");
    }
}