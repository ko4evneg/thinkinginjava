package ch09_interfaces.exercise18;

import static thinkinginjava.Utils.print;

public interface Cycle {
    void move();

    default void outName(){
        print(this.getClass().getSimpleName());
    }
}
