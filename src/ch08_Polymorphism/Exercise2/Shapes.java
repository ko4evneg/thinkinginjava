package ch08_Polymorphism.Exercise2;

import java.util.Random;
//Exercise 2: (1) Add the @Override annotation to the shapes example.

public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
// Fill up the array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
// Make polymorphic method calls:
        for(Shape shp : s)
            shp.draw();
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(4);
    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}

class Triangle extends Shape {
    @Override
    public void draw() { System.out.println("Triangle.draw()"); }
    @Override
    public void erase() { System.out.println("Triangle.erase()"); }
}

class Square extends Shape {
    @Override
    public void draw() { System.out.println("Square.draw()"); }
    @Override
    public void erase() { System.out.println("Square.erase()"); }
}

class Circle extends Shape {
    @Override
    public void draw() { System.out.println("Circle.draw()"); }
    @Override
    public void erase() { System.out.println("Circle.erase()"); }
}

class Shape {
    public void draw() {}
    public void erase() {}
}