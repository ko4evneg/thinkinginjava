package ch09_interfaces.exercise18;

import static thinkinginjava.Utils.print;

public class Tricycle implements Cycle {
    @Override
    public void move() {
        print("Moving on tricycle");
    }
}
