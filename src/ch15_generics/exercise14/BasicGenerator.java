//Exercise 14: (1) Modify BasicGeneratorDemo.java to use the explicit form of creation for the Generator (that is, use
//the explicit constructor instead of the generic create( ) method).

package ch15_generics.exercise14;

import thinkinginjava.util.Generator;

public class BasicGenerator<T> implements Generator<T> {
		private Class<T> type;

		public BasicGenerator(Class<T> type) {
				this.type = type;
		}

		public T next() {

				try {
// Assumes type is a public class:
						return type.newInstance();
				} catch (Exception e) {
						throw new RuntimeException(e);
				}
		}

		// Produce a Default generator given a type token:
		public static <T> Generator<T> create(Class<T> type) {
				return new BasicGenerator<T>(type);
		}

		public static void main(String[] args) {
				Generator<CountedObject> gen = new BasicGenerator<>(CountedObject.class);
				for (int i = 0; i < 5; i++)
						System.out.println(gen.next());
		}
}