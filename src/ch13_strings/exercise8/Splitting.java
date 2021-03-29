package ch13_strings.exercise8;

import java.util.Arrays;
//Exercise 8: (2) Split the string Splitting.knights on the words "the" or “you."

public class Splitting {
		public static String knights =
						"Then, when you have found the shrubbery, you must " +
										"cut down the mightiest tree in the forest... " +
										"with... a herring!";

		public static void split(String regex) {
				System.out.println(
								Arrays.toString(knights.split(regex)));
		}

		public static void main(String[] args) {
				split("the|you");
		}
}