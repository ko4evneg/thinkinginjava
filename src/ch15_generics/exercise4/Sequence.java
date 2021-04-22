package ch15_generics.exercise4;
//Exercise 2: (1) Create a class that holds a String, and has a toString( ) method that displays this String. Add
//several instances of your new class to a Sequence object, then display them.

//Exercise 4: (3) "Generify" innerclasses/Sequence.java.

import java.util.ArrayList;

interface Selector {
		boolean end();

		Object current();

		void next();
}

public class Sequence<T> {
		private ArrayList<T> items;
		private int next = 0;

		public Sequence(int size) {
				items = new ArrayList<T>(size);
		}

		public void add(T x) {
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
						if (i < items.size()) i++;
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

		public static void main(String[] args) {
				Sequence<Sequence.Stringer> sequence = new Sequence<>(10);
				for (int i = 0; i < 10; i++)
						sequence.add(sequence.new Stringer(String.valueOf(i)));

				Selector selector = sequence.selector();
				while (!selector.end()) {
						System.out.print(selector.current() + " ");
						selector.next();
				}
		}
}