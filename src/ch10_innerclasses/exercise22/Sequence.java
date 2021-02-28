package ch10_innerclasses.exercise22;
//Exercise 22: (2) Implement reverseSelector( ) in Sequence.java.

//As an example, if Sequence.java did not use inner classes, you’d have to say, "A Sequence is a Selector," and you’d
//only be able to have one Selector in existence for a particular Sequence. You can easily have a second method,
//reverseSelector( ), that produces a Selector that moves backward through the sequence. This kind of flexibility
//is only available with inner classes.

import static thinkinginjava.Utils.print;

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

        public int getI() {
            return i;
        }
    }

    private class ReverseSequenceSelector extends SequenceSelector{
        //private int i = 0;

        @Override
        public Object current() {
            return items[items.length - getI() - 1];
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reverseSelector() {
        return new ReverseSequenceSelector();
    }

    @Override
    public String toString() {
        return "That's Sequence() class";
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);
        sequence.add("Str1");
        sequence.add("Str2");
        sequence.add("Str3");
        sequence.add("Str4");
        sequence.add("Str5");
        SequenceSelector selector = (SequenceSelector) sequence.selector();
        while (!selector.end()) {
            print(selector.current());
            selector.next();
        }
        print("---reverse---");
        ReverseSequenceSelector reverseSelector = (ReverseSequenceSelector) sequence.reverseSelector();
        while (!reverseSelector.end()) {
            print(reverseSelector.current());
            reverseSelector.next();
        }
    }
}