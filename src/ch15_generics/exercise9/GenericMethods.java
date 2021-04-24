//Exercise 9: (1) Modify GenericMethods.java so that f( ) accepts three arguments, all of which are of a different
//parameterized type.

package ch15_generics.exercise9;

public class GenericMethods {
		public <T, U, V> void f(T t, U u, V v) {
				System.out.println(t.getClass().getName());
				System.out.println(u.getClass().getName());
				System.out.println(v.getClass().getName());
				System.out.println("--------------------");
		}

		public static void main(String[] args) {
				GenericMethods gm = new GenericMethods();
				gm.f("", 1.4f, gm);
		}
}