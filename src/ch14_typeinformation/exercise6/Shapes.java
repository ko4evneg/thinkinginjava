package ch14_typeinformation.exercise6;

import java.util.Arrays;
import java.util.List;

import static thinkinginjava.util.Utils.print;

//Exercise 6: (4) Modify Shapes.java so that it can "highlight" (set a flag in) all shapes of a particular type. The
//toString( ) method for each derived Shape should indicate whether that Shape is "highlighted."

abstract class Shape {
		boolean highlighted = false;

		void draw() {
				System.out.println(this + ".draw()");
		}

		public String toString() {
				return highlighted ? " highlighted." : " dimmed.";
		}

}

class Circle extends Shape {
		public String toString() {
				return "Circle" + super.toString();
		}
}

class Square extends Shape {
		public String toString() {
				return "Square" + super.toString();
		}
}

class Triangle extends Shape {
		public String toString() {
				return "Triangle" + super.toString();
		}
}

class Rhomboid extends Shape {
		public String toString() {
				return "Rhomboid" + super.toString();
		}
}

public class Shapes {
		public static void main(String[] args) {
				List<Shape> shapeList = Arrays.asList(
								new Circle(), new Square(), new Triangle(), new Rhomboid()
				);
				shapeList.forEach(shape -> {
						if (shape instanceof Square)
								shape.highlighted = true;
						print(shape);
				});
		}
}