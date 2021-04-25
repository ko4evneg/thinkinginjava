//Exercise 13: (4) Overload the fill( ) method so that the arguments and return types are the specific subtypes of
//Collection: List, Queue and Set. This way, you don’t lose the type of container. Can you overload to distinguish
//between List and LinkedList?
package ch15_generics.exercise13;

import ch15_generics.exercise7.Fibonacci;
import thinkinginjava.util.Generator;

import java.util.*;

public class Generators {
		public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
				for (int i = 0; i < n; i++)
						coll.add(gen.next());
				return coll;
		}

		public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
				for (int i = 0; i < n; i++)
						list.add(gen.next());
				return list;
		}

		public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) {
				for (int i = 0; i < n; i++)
						set.add(gen.next());
				return set;
		}

		public static <T> Queue<T> fill(Queue<T> queue, Generator<T> gen, int n) {
				for (int i = 0; i < n; i++)
						queue.offer(gen.next());
				return queue;
		}

		public static void main(String[] args) {
				CoffeeGenerator cg = new CoffeeGenerator();
				Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), cg, 3);
				List<Coffee> coffeeList = fill(new ArrayList<>(), cg, 3);
				Set<Coffee> coffeeSet = fill(new HashSet<>(), cg, 3);
				Queue<Coffee> coffeeQueue = fill(new ArrayDeque<>(), cg, 3);
				for (Coffee c : coffeeList)
						System.out.println(c);
				System.out.println();
				for (Coffee c : coffeeSet)
						System.out.println(c);
				System.out.println();
				while (!coffeeQueue.isEmpty())
						System.out.println(coffeeQueue.poll());
		}
}