//Exercise 11: (1) Test New.java by creating your own classes and ensuring that New will work properly with them.
package ch15_generics.exercise11;

import static thinkinginjava.util.Utils.print;

public class Box<T> {
		public T boxContent;

		public Box() {
		}

		public static void main(String[] args) {
				Box<String> stringBox = new Box<>();
				stringBox.boxContent = "string!";
				print(stringBox.boxContent);
		}
}
