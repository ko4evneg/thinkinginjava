package ch15_generics.exercise18;

import thinkinginjava.util.Generator;

public class SmallFish {
		private static int counter = 1;
		private int id = counter++;

		public static Generator<SmallFish> getGen(){
				return SmallFish::new;
		}

		@Override
		public String toString() {
				return "Small fish #" + id;
		}
}
