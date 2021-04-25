package ch10_innerclasses.exercise4;
//Exercise 4: (2) Add a method to the class Sequence.SequenceSelector that produces the reference to the outer class
//Sequence.

import static thinkinginjava.util.Utils.print;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }

        public Sequence getOuter() {
            //Return of Outer class
            return Sequence.this;
        }
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

    public Selector selector() {
        return new SequenceSelector();
    }

    @Override
    public String toString() {
        return "That's Sequence() class";
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(1);
        sequence.add(sequence.new Stringer(String.valueOf(0)));
        Sequence.SequenceSelector selector = (Sequence.SequenceSelector) sequence.selector();
        print(selector.getOuter());
    }
}