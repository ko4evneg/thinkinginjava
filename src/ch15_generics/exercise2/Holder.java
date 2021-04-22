package ch15_generics.exercise2;
//Exercise 2: (1) Create a holder class that holds three objects of the same type, along with the methods to store and
//fetch those objects and a constructor to initialize all three.

public class Holder<T> {
		T o1,
						o2,
						o3;

		public static void main(String[] args) {
				Holder<Holder.Obj> holder = new Holder<>(new Obj("One"), new Obj("Two"), new Obj("Three"));
				for (int i = 1; i < 4; i++) {
						System.out.println(holder.get(i));
				}
		}

		private static class Obj {
				String name;

				public Obj(String name) {
						this.name = name;
				}

				@Override
				public String toString() {
						return name;
				}
		}

		public Holder(T o1, T o2, T o3) {
				this.o1 = o1;
				this.o2 = o2;
				this.o3 = o3;
		}

		public T get(int i) {
				T obj;
				switch (i) {
						case 1:
								obj = o1;
								break;
						case 2:
								obj = o2;
								break;
						default:
								obj = o3;
				}
				return obj;
		}

		public void set(int i, T o) {
				switch (i) {
						case 1:
								o1 = o;
								break;
						case 2:
								o2 = o;
								break;
						default:
								o3 = o;
				}
		}
}
