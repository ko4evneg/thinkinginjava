package ch12_errorhandlingwithexceptions.exercise22;
//Exercise 22: (2) Create a class called FailingConstructor with a constructor that might fail partway through the
//construction process and throw an exception. In main( ), write code that properly guards against this failure.

import java.util.Arrays;
import java.util.Random;

import static thinkinginjava.Utils.print;

class RandomLowNumberException extends Exception {
}

public class FailingConstructor {
		private static boolean hasInstances = false;
		public FailingConstructor() throws RandomLowNumberException {
				Random r = new Random();
				int i = r.nextInt(10);
				if (i < 3)
						throw new RandomLowNumberException();
				hasInstances = true;
		}
		@Override
		public String toString() {
				return Integer.toHexString(this.getClass().hashCode());
		}
		public static void main(String[] args) {
				FailingConstructor[] fc = new FailingConstructor[5];
				for (int j = 0; j < 5; j++) {
						try {
								fc[j] = new FailingConstructor();
								print("Fc created");
						} catch (RandomLowNumberException e) {
								hasInstances = false;
								e.printStackTrace();
						}
				}
				print(Arrays.toString(fc));
		}
}
