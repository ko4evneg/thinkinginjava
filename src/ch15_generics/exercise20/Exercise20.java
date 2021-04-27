//Exercise 20: (1) Create an interface with two methods, and a class that implements that interface and adds another
//method. In another class, create a generic method with an argument type that is bounded by the interface, and show
//that the methods in the interface are callable inside this generic method. In main( ), pass an instance of the
//implementing class to the generic method.
package ch15_generics.exercise20;

public class Exercise20 {
		public static <T extends TwoMethods> void genericMethod(T t) {
				t.one();
				t.two();
		}

		public static void main(String[] args) {
				TwoMethodsImpl twoMethodsImpl = new TwoMethodsImpl();
				genericMethod(twoMethodsImpl);
		}
}
