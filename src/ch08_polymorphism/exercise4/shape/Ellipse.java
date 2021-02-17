package ch08_polymorphism.exercise4.shape;

import static thinkinginjava.Utils.print;

public class Ellipse extends Shape{
    @Override
    public void draw() {
        print("Ellipse.draw()");
    }

    @Override
    public void erase() {
        print("Ellipse.draw()");
    }
}
