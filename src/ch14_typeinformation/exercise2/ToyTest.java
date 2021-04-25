package ch14_typeinformation.exercise2;

import static thinkinginjava.util.Utils.print;

//Exercise 2: (2) Incorporate a new kind of interface into ToyTest.java and verify that it is detected and displayed properly.

interface HasBatteries {}

interface Waterproof {}

interface Shoots {}

interface Unbreakable {}

class Toy {
		// Comment out the following default constructor
// to see NoSuchMethodError from (*1*)
		Toy() {}
		Toy(int i) {}
}

class FancyToy extends Toy
				implements HasBatteries, Waterproof, Shoots, Unbreakable {
		FancyToy() { super(1); }
}

public class ToyTest {
		static void printInfo(Class cc) {
				print("Class name: " + cc.getName() +
								" is interface? [" + cc.isInterface() + "]");
				print("Simple name: " + cc.getSimpleName());
				print("Canonical name : " + cc.getCanonicalName());
		}
		public static void main(String[] args) {
				Class c = null;
				try {
						c = Class.forName("ch14_typeinformation.exercise2.FancyToy");
				} catch(ClassNotFoundException e) {
						print("Can’t find FancyToy");
						System.exit(1);
				}
				printInfo(c);
				for(Class face : c.getInterfaces())
						printInfo(face);
				Class up = c.getSuperclass();
				Object obj = null;
				try {
// Requires default constructor:
						obj = up.newInstance();
				} catch(InstantiationException e) {
						print("Cannot instantiate");
						System.exit(1);
				} catch(IllegalAccessException e) {
						print("Cannot access");
						System.exit(1);
				}
				printInfo(obj.getClass());
		}
}