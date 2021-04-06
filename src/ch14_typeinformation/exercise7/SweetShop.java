package ch14_typeinformation.exercise7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static thinkinginjava.Utils.print;
//Exercise 7: (3) Modify SweetShop.java so that each type of object creation is controlled by a command-line argument.
//That is, if your command line is "Java Sweetshop Candy," then only the Candy object is created. Notice how you can
//control which Class objects are loaded via the commandline argument.

class Candy {
		static { print("Loading Candy"); }
}

class Gum {
		static { print("Loading Gum"); }
}

class Cookie {
		static { print("Loading Cookie"); }
}

public class SweetShop {
		public static void main(String[] args) {
				List<Object> objects = new ArrayList<>();
				Arrays.stream(args).forEach(obj -> {
						switch (obj) {
								case "Candy":
										objects.add(new Candy());
										break;
								case "Gum":
										objects.add(new Gum());
										break;
								case "Cookie":
										objects.add(new Cookie());
										break;
						}
				});
				objects.stream().forEach(o -> print(o.getClass().getSimpleName()));
		}
}