package ch08_polymorphism.exercise4.shape;

import static thinkinginjava.util.Utils.print;

public class Square extends Shape {
    @Override
    public void draw() { print("Square.draw()"); }
    @Override
    public void erase() { print("Square.erase()"); }
}