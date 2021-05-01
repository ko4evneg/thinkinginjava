//Exercise 23: (1) Modify FactoryConstraint.java so that create( ) takes an argument.
package ch15_generics.exercise23;

import java.util.Arrays;

interface FactoryI<T> {
		T create(Object... objs);
}

class Foo2<T> {
		private T x;

		public <F extends FactoryI<T>> Foo2(F factory, Object... objs) {
				x = factory.create(objs);
		}

		@Override
		public String toString() {
				return x.toString();
		}

		// ...
}

class IntegerFactory implements FactoryI<Integer> {
		public IntegerFactory() {
		}

		@Override
		public Integer create(Object... objs) {
				return (Integer) objs[0];
		}
}

class Widget {
		public Widget() {
		}

		public Widget(Object... objs) {
				Arrays.stream(objs).forEach(System.out::println);
		}

		public static class Factory implements FactoryI<Widget> {
				public Factory() {
				}

				@Override
				public Widget create(Object... objs) {
						return new Widget(objs);
				}
		}
}

public class FactoryConstraint {
		public static void main(String[] args) {
				System.out.println(new Foo2<Integer>(new IntegerFactory(), 10));
				new Foo2<Widget>(new Widget.Factory(), 15, 20, 25);
		}
}