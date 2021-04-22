package ch15_generics.exercise3;
//Exercise 3 : (1) Create and test a SixTuple generic.

import static thinkinginjava.Utils.print;

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
		public final F sixths;

		public static void main(String[] args) {
				SixTuple<String, Integer, Float, Human, Animal, Monster> st = new SixTuple(
								"string", 3, 5.6, new Human(), new Animal(), new Monster()
				);
				print(st);
		}

		public SixTuple(A a, B b, C c, D d, E e, F f) {
				super(a, b, c, d, e);
				sixths = f;
		}

		public String toString() {
				return "(" + first + ", " + second + ", " +
								third + ", " + fourth + ", " + fifth + ", " + sixths + ")";
		}
}

class Human {}
class Animal{}
class Monster{}