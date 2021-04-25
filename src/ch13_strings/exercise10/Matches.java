package ch13_strings.exercise10;

import static thinkinginjava.util.Utils.print;
import static thinkinginjava.util.Utils.printf;

//Exercise 10: (2) For the phrase "Java now has regular expressions" evaluate whether the following expressions will
//find a match:
//^Java
//\Breg.*
//n.w\s+h(a|i)s
//s?
//s*
//s+
//s{4}
//S{1}.
//s{0,3}
public class Matches {
		private static final String s = "Java now has regular expressions";

		public static void main(String[] args) {
				printf("%-13s:%b\n", "\"^Java\"", s.matches("^Java"));
				printf("%-13s:%b\n", "\\Breg.*", s.matches("\\Breg.*"));
				printf("%-13s:%b\n", "n.w\\s+h(a|i)s", s.matches("n.w\\s+h(a|i)s"));
				printf("%-13s:%b\n", "s?", s.matches("s?"));
				printf("%-13s:%b\n", "s*", s.matches("s*"));
				printf("%-13s:%b\n", "s+", s.matches("s+"));
				printf("%-13s:%b\n", "s{4}", s.matches("s{4}"));
				printf("%-13s:%b\n", "s{1}.", s.matches("s{1}."));
				printf("%-13s:%b\n", "s{0,3}", s.matches("s{0,3}"));
		}
}
