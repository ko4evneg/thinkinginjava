package ch13_strings.exercise14;

import java.util.Arrays;
import java.util.regex.Pattern;
import static thinkinginjava.Utils.print;

//Exercise 14: (1) Rewrite SplitDemo using String.split( ).

public class SplitDemo {
		public static void main(String[] args) {
				String input =
								"This!!unusual use!!of exclamation!!points";
				print(Arrays.toString(
								input.split("!!")));
// Only do the first three:
				print(Arrays.toString(
								input.split("!!", 3)));
		}
}