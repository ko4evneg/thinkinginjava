package ch14_typeinformation.exercise8;

//Exercise 8: (5) Write a method that takes an object and recursively prints all the classes in that object’s hierarchy.

import static thinkinginjava.Utils.print;

class Base {}
class LOne extends Base {}
class LTwo extends LOne {}
class Bottom extends LTwo {}

public class HierarchyPrint {
		public static void main(String[] args) {
			Bottom b = new Bottom();
			printHierarchy(b);
		}

		public static void printHierarchy(Object o) {
				print(o.getClass().getName());
				Class c = o.getClass();
 				while ((c = c.getSuperclass()) != null) {
						print(c.getName());
				}
		}
}
