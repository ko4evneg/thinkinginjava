package ch12_errorhandlingwithexceptions.exercise24;
//Exercise 22: (2) Create a class called FailingConstructor with a constructor that might fail partway through the
//construction process and throw an exception. In main( ), write code that properly guards against this failure.

//Exercise 24: (3) Add a dispose( ) method to the FailingConstructor class and write code to properly use this class.

import java.util.Random;

import static thinkinginjava.util.Utils.print;

class RandomLowNumberException extends Exception {
}

public class FailingConstructor {
		private static boolean isCreated[] = new boolean[5];
		private static int instances = 0;
		private int id = instances++;

		public FailingConstructor() throws RandomLowNumberException {
				Random r = new Random();
				int i = r.nextInt(10);
				if (i < 5)
						throw new RandomLowNumberException();
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
						FailingConstructor fc1 = new FailingConstructor();
						try {
								FailingConstructor fc2 = new FailingConstructor();
						} catch (RandomLowNumberException e) {
								print("fc2 creation fails!");
						} finally {
								fc1.dispose();
						}
				} catch (RandomLowNumberException e) {
						print("fc1 creation fails!");
				}
		}
}
