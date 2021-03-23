package ch12_errorhandlingwithexceptions.exercise29;
//Exercise 20: (3) Modify StormyInning.java by adding an UmpireArgument exception type and methods that throw this
//exception. Test the modified hierarchy.

//Exercise 29: (1) Modify all the exception types in Stormylnning.java so that they extend RuntimeException, and show
//that no exception specifications or try blocks are necessary. Remove the ‘//!’ comments and show how the methods can
//be compiled without specifications.

class BaseballException extends RuntimeException {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
		public Inning() throws BaseballException {
		}

		public void event() throws BaseballException {
				// Doesn’t actually have to throw anything
		}

		public abstract void atBat() throws Strike, Foul;

		public void walk() {
		} // Throws no checked exceptions
}

class StormException extends RuntimeException {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
		public void event() throws RainedOut;

		public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
		// OK to add new exceptions for constructors, but you
		// must deal with the base constructor exceptions:
		public StormyInning() {
		}

		public StormyInning(String s) {
		}

		// Regular methods must conform to base class:
		public void walk() {
		} //Compile error

		// Interface CANNOT add exceptions to existing
		// methods from the base class:
		public void event() {
		}

		// If the method doesn’t already exist in the
		// base class, the exception is OK:
		public void rainHard() {
		}

		// Overridden methods can throw inherited exceptions:
		public void atBat() {
		}

		public static void main(String[] args) {
				StormyInning si = new StormyInning();
				si.atBat();


				Inning i = new StormyInning();
				i.atBat();
		}
}