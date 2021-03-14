package ch11_holdingyourobjects.exercise31.shape;

import static thinkinginjava.Utils.print;

public class Triangle extends Shape {
    @Override
    public void draw() { print("Triangle.draw()"); }
    @Override
    public void erase() { print("Triangle.erase()"); }
}