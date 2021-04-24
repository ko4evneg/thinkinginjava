package outofscopelearning;

import static thinkinginjava.Utils.print;

class Candy {
		static {
				print("Loading Candy");
		}
}

class Gum {
		static {
				print("Loading Gum");
		}
}

class BubbleGum extends Gum {
}

class Cookie {
		static {
				print("Loading Cookie");
		}
}

public class Test<T> {
		public T t;

		public static void main(String[] args) {
				Test<String> test = new Test<>();
				test.t = "t string outer";
				Test.Nested<String> testNested = new Test.Nested<>();
				testNested.t = "t shadowed";
				System.out.println(test.t);
				System.out.println(testNested.t);
		}

		static class Nested<T> {
				public T t;

		}
}
