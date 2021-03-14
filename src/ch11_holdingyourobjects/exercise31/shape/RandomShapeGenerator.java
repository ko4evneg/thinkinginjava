package ch11_holdingyourobjects.exercise31.shape;

import java.util.Iterator;
import java.util.Random;
//Exercise 31: (3) Modify polymorphism/shape/RandomShapeGenerator.java to make it Iterable. You’ll need to add a
//constructor that takes the number of elements that you want the iterator to produce before stopping. Verify that it
//works.

public class RandomShapeGenerator implements Iterable{
    private Random rand = new Random();

    public Shape next(int i) {
        switch(i) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Ellipse();
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int i = 0;
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Object next() {
                return RandomShapeGenerator.this.next(i > 3 ? i++ % 4 : i++);
            }
        };
    }


}
