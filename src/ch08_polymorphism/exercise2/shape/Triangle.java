package ch08_polymorphism.exercise2.shape;

import static thinkinginjava.util.Utils.print;

public class Triangle extends Shape {
    @Override
    public void draw() { print("Triangle.draw()"); }
    @Override
    public void erase() { print("Triangle.erase()"); }
}