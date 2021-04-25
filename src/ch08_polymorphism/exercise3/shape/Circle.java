package ch08_polymorphism.exercise3.shape;

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
