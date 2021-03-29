package ch13_strings.exercise5;
//Exercise 5: (5) For each of the basic conversion types in the above table, write the most complex formatting
//expression possible. That is, use all the possible format specifiers available for that conversion type.

public class Conversions {
		public static void main(String[] args) {
				//d - Integral (decimal)
				//f - Float (decimal)
				System.out.printf("%2$-5d : %1$10.3f\n", 24.597824, 301);
				//s - String
				System.out.printf("%-20.10s\n", "This is really very long one string, going somewhere out of screen...".hashCode());
				//c - Unicode
				System.out.printf("%-4d:%2c\n", (int)'t', 't');
				//h - Hash code
				//x - Integral (hex)
				System.out.printf("%-4d (hash: %10h; hashCheck = %x)\n", 2308, "Strubtsina", "Strubtsina".hashCode());
				//b - Boolean
				System.out.printf("%%b checks:\n" +
								"bool: %b/%b\n" +
								"int: %b\n" +
								"obj: %b\n" +
								"null: %b\n", false, true, -1, new Object(), null);
				for (byte b : "Bytecode".getBytes()) {
						System.out.printf("%1$2x(%1$03d) ", b);
				}

		}
}
