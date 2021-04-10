package outofscopelearning;

import static thinkinginjava.Utils.print;

class Candy {
		static { print("Loading Candy"); }
}
class Gum {
		static { print("Loading Gum"); }
}

class BubbleGum extends Gum {
		}

class Cookie {
		static { print("Loading Cookie"); }
}
public class Test {
		public static void main(String[] args) {
			Gum g  = new Gum();
			BubbleGum b = new BubbleGum();
				System.out.println(BubbleGum.class.isInstance(g));
				System.out.println(Gum.class.isInstance(b));
		}
}
