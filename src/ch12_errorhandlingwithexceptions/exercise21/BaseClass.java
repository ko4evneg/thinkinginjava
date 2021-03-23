package ch12_errorhandlingwithexceptions.exercise21;
//Exercise 21: (2) Demonstrate that a derived-class constructor cannot catch exceptions thrown by its base-class
//constructor.

import ch07_reusingclasses.exercise23.Derived;

class ExampleException extends Exception {
}

public class BaseClass {
	 public BaseClass() throws ExampleException {
			throw new ExampleException();
	 }
}

class DerivedClass extends BaseClass {
	 public DerivedClass() throws ExampleException {
//		Not working! Super call must be the first statement in a constructor's body.
//	 	 try {
//	 	 	 super();
//		 } catch (ExampleException e) {
//	 	 	 e.printStackTrace();
//		 }
			super();
	 }
	 public static void main(String[] args) throws ExampleException{
			DerivedClass dc = new DerivedClass();
	 }
}