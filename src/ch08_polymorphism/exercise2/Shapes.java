package ch08_polymorphism.exercise2;
//Exercise 2: (1) Add the @Override annotation to the shapes example.
import ch08_polymorphism.exercise2.shape.*;

public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for (Shape shp : s)
            shp.draw();
    }
}