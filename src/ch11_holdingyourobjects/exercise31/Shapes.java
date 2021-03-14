package ch11_holdingyourobjects.exercise31;
//Exercise 4: (2) Add a new type of Shape to Shapes.java and verify in main( ) that polymorphism works for your new
//type as it does in the old types.

//Exercise 31: (3) Modify polymorphism/shape/RandomShapeGenerator.java to make it Iterable. You’ll need to add a
//constructor that takes the number of elements that you want the iterator to produce before stopping. Verify that it
//works.

import ch11_holdingyourobjects.exercise31.shape.RandomShapeGenerator;
import ch11_holdingyourobjects.exercise31.shape.Shape;

import java.util.Iterator;

public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();

    public static void main(String[] args) {
        Iterator<Shape> it = gen.iterator();
        Shape[] s = new Shape[16];
        // Fill up the array with shapes:
        for (int i = 0; i < s.length; i++)
            s[i] = it.next();
        // Make polymorphic method calls:
        for (Shape shp : s) {
            shp.draw();
            //shp.printShape();
        }
    }
}