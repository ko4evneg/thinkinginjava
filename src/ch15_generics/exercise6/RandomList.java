//Exercise 6: (1) Use RandomList with two more types in addition to the one shown in main( ).
package ch15_generics.exercise6;

import java.util.*;

public class RandomList<T> {
		private ArrayList<T> storage = new ArrayList<T>();
		private Random rand = new Random();

		public void add(T item) {
				storage.add(item);
		}

		public T select() {
				return storage.get(rand.nextInt(storage.size()));
		}

		public static void main(String[] args) {
				RandomList<String> rs = new RandomList<String>();
				RandomList<Integer> ri = new RandomList<>();
				RandomList<RandomList.Coordinates> rc = new RandomList<>();


				for (String s : ("The quick brown fox jumped over " +
								"the lazy brown dog").split(" "))
						rs.add(s);
				for (int i = 0; i < 10; i++) {
						ri.add(i);
						rc.add(ri.new Coordinates(rc.rand.nextInt(100), rc.rand.nextInt(100)));
				}
				for (int i = 0; i < 11; i++) {
						System.out.print(rs.select() + " ");
				}
				System.out.println();
				for (int i = 0; i < 11; i++) {
						System.out.print(ri.select() + " ");
				}
				System.out.println();
				for (int i = 0; i < 11; i++) {
						System.out.print(rc.select() + " ");
				}
		}

		class Coordinates {
				int x, y;

				public Coordinates(int x, int y) {
						this.x = x;
						this.y = y;
				}

				@Override
				public String toString() {
						return String.format("(%-2d, %2d)", x, y);
				}
		}
}