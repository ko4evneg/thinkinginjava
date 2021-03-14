package ch11_holdingyourobjects.exercise31.shape;

import static thinkinginjava.Utils.print;

public class Square extends Shape {
    @Override
    public void draw() { print("Square.draw()"); }
    @Override
    public void erase() { print("Square.erase()"); }
}