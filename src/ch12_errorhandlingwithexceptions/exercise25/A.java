package ch12_errorhandlingwithexceptions.exercise25;
//Exercise 25: (2) Create a three-level hierarchy of exceptions. Now create a base-class A with a method that throws an
//exception at the base of your hierarchy. Inherit B from A and override the method so it throws an exception at level
//two of your hierarchy. Repeat by inheriting class C from B. In main( ), create a C and upcast it to A, then call the
//method.

public class A {
		public void throwBase() throws BaseException{
				throw new BaseException();
		}

		public static void main(String[] args) throws BaseException{
				A c = new C();
				c.throwBase();
		}
}

class B extends A{
		@Override
		public void throwBase() throws BaseException {
				throw new MidException();
		}
}

class C extends A{
		@Override
		public void throwBase() throws BaseException {
				throw new DeepException();
		}
}

class BaseException extends Exception{}
class MidException extends BaseException{}
class DeepException extends MidException{}

