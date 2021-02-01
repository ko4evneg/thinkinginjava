//Exercise 15: (2) Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem described in this section.

package ch08_Polymorphism.Exercise15;

    class Glyph {
        void draw() { System.out.println("Glyph.draw()"); }
        Glyph() {
            System.out.println("Glyph() before draw()");
            draw();
            System.out.println("Glyph() after draw()");
        }
    }
    
    class RoundGlyph extends Glyph {
        private int radius = 1;
        RoundGlyph(int r) {
            radius = r;
            System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
        }
        void draw() {
            System.out.println("RoundGlyph.draw(), radius = " + radius);
        }
    }

 class RectangularGlyph extends Glyph {
    private boolean b = false;
    RectangularGlyph(boolean b) {
        this.b = b;
        System.out.println("RectangularGlyph.RectangularGlyph(), bool = " + this.b);
    }
    void draw() {
        System.out.println("RectangularGlyph.draw(), bool = " + this.b);
    }
}
    
    public class PolyConstructors {
        public static void main(String[] args) {
            new RectangularGlyph(true);
        }
    }

