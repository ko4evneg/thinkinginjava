package ch11_holdingyourobjects.exercise3;
//Exercise 3: (2) Modify innerclasses/Sequence.java so that you can add any number of elements to it.

import java.util.*;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private List<Object> items;
    private int next = 0;

    public Sequence(int size) {
        items = new ArrayList<>(size);
    }

    public void add(Object x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.size();
        }

        public Object current() {
            return items.get(i);
        }

        public void next() {
            i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}