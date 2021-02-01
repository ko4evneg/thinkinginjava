package ch08_Polymorphism.Exercise3;

import java.util.Random;
//Exercise 3: (1) Add a new method in the base class of Shapes.java that prints a message,
// but don’t override it in the derived classes. Explain what happens. Now override it in
// one of the derived classes but not the others, and see what happens. Finally, override
// it in all the derived classes.

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
            shp.sms();
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

    @Override
    public void sms() {
        System.out.println("Triangle sms");
    }
}

class Square extends Shape {
    @Override
    public void draw() { System.out.println("Square.draw()"); }
    @Override
    public void erase() { System.out.println("Square.erase()"); }
    @Override
    public void sms() {
        System.out.println("Square sms");
    }
}

class Circle extends Shape {
    @Override
    public void draw() { System.out.println("Circle.draw()"); }
    @Override
    public void erase() { System.out.println("Circle.erase()"); }
    @Override
    public void sms() {
        System.out.println("Circle sms");
    }
}

class Shape {
    public void draw() {}
    public void erase() {}
    public void sms() {
        System.out.println("LA SMS");
    }
}