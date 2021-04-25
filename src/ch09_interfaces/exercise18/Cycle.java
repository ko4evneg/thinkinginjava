package ch09_interfaces.exercise18;

import static thinkinginjava.util.Utils.print;

public interface Cycle {
    void move();

    default void outName(){
        print(this.getClass().getSimpleName());
    }
}
