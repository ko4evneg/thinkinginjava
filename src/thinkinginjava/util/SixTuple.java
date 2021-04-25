package thinkinginjava.util;
//Exercise 3 : (1) Create and test a SixTuple generic.

import static thinkinginjava.util.Utils.print;

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
		public final F sixths;

		public SixTuple(A a, B b, C c, D d, E e, F f) {
				super(a, b, c, d, e);
				sixths = f;
		}

		public String toString() {
				return "(" + first + ", " + second + ", " +
								third + ", " + fourth + ", " + fifth + ", " + sixths + ")";
		}
}
