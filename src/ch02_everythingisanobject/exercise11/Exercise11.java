package ch02_everythingisanobject.exercise11;
//Exercise 11: (1) Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.

public class Exercise11 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow instance = new AllTheColorsOfTheRainbow();
        instance.anIntegerRepresentingColors = 3;
        System.out.println(instance.anIntegerRepresentingColors);

        instance.changeTheHueOfTheColor(7);
        System.out.println(instance.anIntegerRepresentingColors);
    }
}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }
}