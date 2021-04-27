package thinkinginjava.util;
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

		public static <T> T[] fill(T[] arr, Generator<T> gen, int n) {
				for (int i = 0; i < n; i++)
						arr[i] = gen.next();
				return arr;
		}
}