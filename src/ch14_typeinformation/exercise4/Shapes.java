package ch14_typeinformation.exercise4;

import ch06_accesscontrol.exercise3.debug.Example;

import static thinkinginjava.Utils.print;

//Exercise 3: (2) Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a Shape, then downcast it back to a
//Rhomboid. Try downcasting to a Circle and see what happens.

//Exercise 4: (2) Modify the previous exercise so that it uses instanceof to check the type before performing the
// downcast.

abstract class Shape {
		void draw() {
				System.out.println(this + ".draw()");
		}

		abstract public String toString();
}

class Circle extends Shape {
		public String toString() {
				return "Circle";
		}
}

class Square extends Shape {
		public String toString() {
				return "Square";
		}
}

class Triangle extends Shape {
		public String toString() {
				return "Triangle";
		}
}

class Rhomboid extends Shape {
		public String toString() {
				return "Rhomboid";
		}
}

public class Shapes {
		public static void main(String[] args) throws Exception {
				Shape s = new Rhomboid();
				Rhomboid r = null;
				Circle c = null;
				if (s instanceof Rhomboid)
						r = (Rhomboid) s;
				if (s instanceof Circle)
						c = (Circle) s;
				print(r);
				//Error:
				//Circle c = (Circle) r;
		}
}