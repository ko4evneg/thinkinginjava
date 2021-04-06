package ch14_typeinformation.exercise9;

//Exercise 8: (5) Write a method that takes an object and recursively prints all the classes in that object’s hierarchy.

//Exercise 9: (5) Modify the previous exercise so that it uses Class.getDeclaredFields( ) to also display information
//about the fields in a class.

import java.util.Arrays;

import static thinkinginjava.Utils.print;

class Base {
		float f;
}

class LOne extends Base {
		Base b;
}

class LTwo extends LOne {
		final static Integer INT = 3;
}

class Bottom extends LTwo {
		int i = 2;
		boolean b = true;
}

public class HierarchyPrint {
		public static void main(String[] args) {
			Bottom b = new Bottom();
			printHierarchy(b);
		}

		public static void printHierarchy(Object o) {
				Class c = o.getClass();
 				do  {
						print(c.getSimpleName() + ":");
						print(Arrays.toString(c.getDeclaredFields()));
				} while ((c = c.getSuperclass()) != null);
		}
}
