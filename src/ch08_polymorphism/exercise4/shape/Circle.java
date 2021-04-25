package ch08_polymorphism.exercise4.shape;

import static thinkinginjava.util.Utils.print;

public class Circle extends Shape {
    @Override
    public void draw() { print("Circle.draw()"); }
    @Override
    public void erase() { print("Circle.erase()"); }

    @Override
    public void printShape() {
        print("Circle()");
    }
}
