//Exercise 16: (2) Add a SixTuple to Tuple.java, and test it in TupleTest2.java.

package ch15_generics.exercise16;

import thinkinginjava.util.*;

import static thinkinginjava.util.Tuple.tuple;

public class TupleTest {
		static TwoTuple<String, Integer> f() {
				return tuple("hi", 47);
		}

		static TwoTuple f2() {
				return tuple("hi", 47);
		}

		static ThreeTuple<Amphibian, String, Integer> g() {
				return tuple(new Amphibian(), "hi", 47);
		}

		static FourTuple<Vehicle, Amphibian, String, Integer> h() {
				return tuple(new Vehicle(), new Amphibian(), "hi", 47);
		}

		static SixTuple<Vehicle, Amphibian, String, Integer, Double, Boolean> k() {
				return tuple(new Vehicle(), new Amphibian(),"hi", 47, 11.1, Boolean.valueOf(false));
		}

		public static void main(String[] args) {
				TwoTuple<String, Integer> ttsi = f();
				System.out.println(ttsi);
				//Looks like not working anymore
				TwoTuple<String, Integer> ttsi2 = f2();
				System.out.println(ttsi2);
				System.out.println(f2());
				System.out.println(g());
				System.out.println(h());
				System.out.println(k());
		}
}

class Amphibian {
}

class Vehicle {
}
