package ch12_errorhandlingwithexceptions.exercise23;
//Exercise 22: (2) Create a class called FailingConstructor with a constructor that might fail partway through the
//construction process and throw an exception. In main( ), write code that properly guards against this failure.

//Exercise 23: (4) Add a class with a dispose( ) method to the previous exercise. Modify FailingConstructor so that the
//constructor creates one of these disposable objects as a member object, after which the constructor might throw an
//exception, after which it creates a second disposable member object. Write code to properly guard against failure,
//and in main( ) verify that all possible failure situations are covered.

import java.util.Arrays;
import java.util.Random;

import static thinkinginjava.Utils.print;

class RandomLowNumberException extends Exception {
}

public class FailingConstructor {
		private static boolean isCreated[] = new boolean[5];
		private static int instances = 0;
		private int id = instances++;

		public FailingConstructor() throws RandomLowNumberException {
				Random r = new Random();
				int i = r.nextInt(10);
				DisposableObject dObj1 = new DisposableObject();
				try {
						dObj1.doAction();
				} catch (RuntimeException e) {
						e.printStackTrace();
				}
				if (i < 5)
						throw new RandomLowNumberException();
				DisposableObject dObj2 = new DisposableObject();
				try {
						dObj2.doAction();
				} catch (RuntimeException e) {
						e.printStackTrace();
				}
				isCreated[id] = true;
				print("Created: " + id);
		}

		@Override
		public String toString() {
				return "id:" + id;
		}

		public void dispose() {
				isCreated[id] = false;
				print("Disposed: " + toString());
				instances--;
		}

		public static void main(String[] args) {
				try {
						FailingConstructor fc = new FailingConstructor();

				} catch (RandomLowNumberException e) {
						print("fc creation fails!");
				}
		}
}

class DisposableObject {
		public void doAction() {
				print("doing action!");
		}

		public void dispose() {
				print("disposed object");
		}
}
