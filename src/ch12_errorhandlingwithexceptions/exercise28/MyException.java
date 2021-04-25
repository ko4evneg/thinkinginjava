package ch12_errorhandlingwithexceptions.exercise28;
//Exercise 4: (2) Create your own exception class using the extends keyword. Write a constructor for this class that
//takes a String argument and stores it inside the object with a String reference. Write a method that displays the
//stored String. Create a try-catch clause to exercise your new exception.

//Exercise 28: (1) Modify Exercise 4 so that the custom exception class inherits from RuntimeException, and show that
//the compiler allows you to leave out the try block.

import static thinkinginjava.util.Utils.print;

public class MyException extends RuntimeException {
		private String exception;

		public MyException(String exception) {
				this.exception = exception;
		}

		public void getError() {
				print(exception);
		}

		public static void main(String[] args) {
				throw new MyException("My exception occurred!");
		}
}
