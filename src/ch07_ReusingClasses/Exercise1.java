package ch07_ReusingClasses;

public class Exercise1 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
    }
}

class Shape {
    Color color;

    @Override
    public String toString() {
        if (color == null)
            color = new Color();
        return "Shape " + color;
    }
}

class Color {
    String s = "green";

    @Override
    public String toString() {
        return s;
    }
}
