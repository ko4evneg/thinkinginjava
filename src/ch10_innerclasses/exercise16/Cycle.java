package ch10_innerclasses.exercise16;

import static thinkinginjava.Utils.print;

public interface Cycle {
    void move();

    default void outName(){
        print(this.getClass().getSimpleName());
    }
}
