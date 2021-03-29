package ch13_strings.exercise9;

import java.util.Arrays;
//Exercise 9: (4) Using the documentation for java.util.regex.Pattern as a resource, replace all the vowels in
//Splitting.knights with underscores.

public class Splitting {
		public static String knights =
						"Then, when you have found the shrubbery, you must " +
										"cut down the mightiest tree in the forest... " +
										"with... a herring!";

		public static void replace(String regex, String replacement) {
				System.out.println(knights.replaceAll(regex, replacement));
		}

		public static void main(String[] args) {
				replace("[aeiouyAEIOUY]","_");
		}
}