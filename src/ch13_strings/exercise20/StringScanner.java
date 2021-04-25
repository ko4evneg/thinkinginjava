package ch13_strings.exercise20;

//Exercise 20: (2) Create a class that contains int, long, float and double and String fields. Create a constructor for
//this class that takes a single String argument, and scans that string into the various fields. Add a toString( )
//method and demonstrate that your class works correctly.

import java.util.Scanner;
import java.util.regex.Pattern;

import static thinkinginjava.util.Utils.print;

public class StringScanner {
		private int i;
		private long l;
		private float f;
		private double d;
		private String s;

		public static void main(String[] args) {
				print(new StringScanner("43/ -65h 12,451.414,415243677"));
		}

		public StringScanner(String s) {
				this.s = s;
				Scanner scanner = new Scanner(s).useDelimiter(Pattern.compile("[^\\d|,|\\-]+"));
				i = scanner.nextInt();
				l = scanner.nextLong();
				f = scanner.nextFloat();
				d = scanner.nextDouble();
		}

		@Override
		public String toString() {
				return String.format("i = %d\nl = %d\nf = %4$f\nd = %3$f", i, l, d, f);
		}
}
