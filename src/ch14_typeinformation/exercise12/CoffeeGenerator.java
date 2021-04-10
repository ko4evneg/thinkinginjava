package ch14_typeinformation.exercise12;

import java.util.Iterator;
import java.util.Random;
import static thinkinginjava.Utils.print;
//Exercise 12: (3) Use TypeCounter with the CoffeeGenerator.java class in the Generics chapter.

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
		private Class[] types = {Latte.class, Mocha.class,
						Cappuccino.class, Americano.class, Breve.class,};
		private static Random rand = new Random();

		public CoffeeGenerator() {
		}

		// For iteration:
		private int size = 0;

		public CoffeeGenerator(int sz) {
				size = sz;
		}

		public Coffee next() {
				try {
						return (Coffee)
										types[rand.nextInt(types.length)].newInstance();
// Report programmer errors at run time:
				} catch (Exception e) {
						throw new RuntimeException(e);
				}
		}

		class CoffeeIterator implements Iterator<Coffee> {
				int count = size;

				public boolean hasNext() {
						return count > 0;
				}

				public Coffee next() {
						count--;
						return CoffeeGenerator.this.next();
				}

				public void remove() { // Not implemented
						throw new UnsupportedOperationException();
				}
		}

		;

		public Iterator<Coffee> iterator() {
				return new CoffeeIterator();
		}

		public static void main(String[] args) {
				CoffeeGenerator gen = new CoffeeGenerator();
				TypeCounter tc = new TypeCounter(Coffee.class);
				for (int i = 0; i < 25; i++) {
						Coffee coffee = gen.next();
						tc.count(coffee);
				}
				print(tc);
		}
}