package ch12_errorhandlingwithexceptions.exercise12;
//Exercise 22: (2) Implement reverseSelector( ) in Sequence.java.

//As an example, if Sequence.java did not use inner classes, you’d have to say, "A Sequence is a Selector," and you’d
//only be able to have one Selector in existence for a particular Sequence. You can easily have a second method,
//reverseSelector( ), that produces a Selector that moves backward through the sequence. This kind of flexibility
//is only available with inner classes.

//Exercise 12: (3) Modify innerclasses/Sequence.java so that it throws an appropriate exception if you try to put in too
//many elements.

import static thinkinginjava.util.Utils.print;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private class TooManyElementsException extends Exception{
        public TooManyElementsException() {
        }

        public TooManyElementsException(String message) {
            super(message);
        }
    }

    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) throws TooManyElementsException {
        if (next < items.length)
            items[next++] = x;
        else
            throw new TooManyElementsException("Bound is: " + items.length);
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

    public static void main(String[] args) throws TooManyElementsException{
        Sequence sequence = new Sequence(5);
        sequence.add("Str1");
        sequence.add("Str2");
        sequence.add("Str3");
        sequence.add("Str4");
        sequence.add("Str5");
        sequence.add("Str6");
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