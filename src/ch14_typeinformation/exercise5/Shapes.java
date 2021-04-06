package ch14_typeinformation.exercise5;

import java.util.Arrays;
import java.util.List;

import static thinkinginjava.Utils.print;

//Exercise 5: (3) Implement a rotate(Shape) method in Shapes.java, such that it checks to see if it is rotating a Circle
//(and, if so, doesn’t perform the operation).

abstract class Shape {
		void draw() {
				System.out.println(this + ".draw()");
		}

		abstract public String toString();

		public void rotate() {
				if (!(this instanceof Circle))
				print(this.getClass().getSimpleName() + " rotating...");
		}
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
				List<Shape> shapeList = Arrays.asList(
								new Circle(), new Square(), new Triangle()
				);
				for(Shape shape : shapeList)
						shape.rotate();
		}
}