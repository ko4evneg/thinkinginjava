package ch11_holdingyourobjects.exercise9;
//Exercise 9: (4) Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.

import java.util.*;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private List items;
    private int next = 0;

    public Sequence(int size) {
        items = new ArrayList(size);
    }

    public void add(Object x) {
        items.add(x);
    }

    class Stringer {
        String a;

        public Stringer(String a) {
            this.a = a;
        }

        @Override
        public String toString() {
            return "s" + a;
        }
    }

    public Iterator getIterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(sequence.new Stringer(String.valueOf(i)));

        Iterator iterator = sequence.getIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}