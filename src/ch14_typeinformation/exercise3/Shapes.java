package ch14_typeinformation.exercise3;

import static thinkinginjava.util.Utils.print;

//Exercise 3: (2) Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a Shape, then downcast it back to a
//Rhomboid. Try downcasting to a Circle and see what happens.

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
		public static void main(String[] args) {
				Shape s = new Rhomboid();
				Rhomboid r = (Rhomboid) s;
				print(r);
				//Error:
				//Circle c = (Circle) r;
		}
}