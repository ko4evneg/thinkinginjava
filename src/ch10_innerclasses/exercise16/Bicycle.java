package ch10_innerclasses.exercise16;

import static thinkinginjava.Utils.print;

public class Bicycle implements Cycle {
    @Override
    public void move() {
        print("Moving on bicycle");
    }
}
