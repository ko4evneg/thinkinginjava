package ch09_interfaces.exercise15;
//Exercise 15: (2) Modify the previous exercise by creating an abstract class and inheriting that into the derived class.

import static thinkinginjava.Utils.print;

abstract class Base implements CommonInterface{
}

public class Exercise15 extends Base  {
    public static void main(String[] args) {
        Exercise15 ex = new Exercise15();
        intOne(ex);
        intTwo(ex);
        intThree(ex);
        intFour(ex);
    }

    static void intOne (IntOne io) {
        print(io.getClass().getSimpleName());
    }
    static void intTwo (IntTwo itw) {
        print(itw.getClass().getSimpleName());
    }
    static void intThree(IntThree ith) {
        print(ith.getClass().getSimpleName());
    }
    static void intFour (CommonInterface ifr) {
        print(ifr.getClass().getSimpleName());
    }

    @Override
    public void zero() {
        print("zero");
    }

    @Override
    public void one() {
        print("one");
    }

    @Override
    public void two() {
        print("two");
    }

    @Override
    public void five() {
        print("five");
    }

    @Override
    public void six() {
        print("six");
    }

    @Override
    public void three() {
        print("three");
    }

    @Override
    public void four() {
        print("four");
    }
}
