//Exercise 11: (1) Test New.java by creating your own classes and ensuring that New will work properly with them.
//Exercise 12: (1) Repeat the previous exercise using explicit type specification.
package ch15_generics.exercise12;
import thinkinginjava.util.New;
import static thinkinginjava.util.Utils.print;

public class Box<T> {
		public T boxContent;

		public Box() {
		}

		public void setContent(Box<T> box){
				this.boxContent = box.boxContent;
		}

		public static void main(String[] args) {
				Box<String> stringBox = new Box<>();
				stringBox.boxContent = "string!";
				print(stringBox.boxContent);
				stringBox.setContent(New.<String>box());
		}
}
