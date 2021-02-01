package ch08_Polymorphism.Exercise4;

import java.awt.*;
import java.util.Random;
//Exercise 4: (2) Add a new type of Shape to Shapes.java and verify in main( )
// that polymorphism works for your new type as it does in the old types.

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
    private Random rand = new Random(15);
    public Shape next() {
        switch(rand.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rectangle();
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
class Rectangle extends Shape {
    @Override
    public void draw() { System.out.println("Rectangle.draw()"); }
    @Override
    public void erase() { System.out.println("Rectangle.erase()"); }
    @Override
    public void sms() {
        System.out.println("Rectangle sms");
    }
}
class Shape {
    public void draw() {}
    public void erase() {}
    public void sms() {
        System.out.println("LA SMS");
    }
}