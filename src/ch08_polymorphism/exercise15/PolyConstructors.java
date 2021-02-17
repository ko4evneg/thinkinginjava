package ch08_polymorphism.exercise15;
//Exercise 15: (2) Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem described in this section.
import static thinkinginjava.Utils.print;

class Glyph {
    void draw() {
        print("Glyph.draw()");
    }

    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}
class RectangularGlyph extends Glyph {
    RectangularGlyph() {
    }

    void draw() {
        print("RectangularGlyph.draw()");
    }
}
class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        print("---");
        new RectangularGlyph();
    }
}