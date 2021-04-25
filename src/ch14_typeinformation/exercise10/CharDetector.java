package ch14_typeinformation.exercise10;
//Exercise 10: (3) Write a program to determine whether an array of char is a primitive type or a true Object.

import static thinkinginjava.util.Utils.print;

public class CharDetector {
		public static void main(String[] args) {
				char[] arr = {'a','b','c'};
				print(detectChar(arr));
				Character[] chars = {'a','b','c'};
				print(detectChar(chars));
		}

		public static boolean detectChar(Object o) {
				if (o instanceof char[]) {
						return false;
				}
				return true;
		}
}
