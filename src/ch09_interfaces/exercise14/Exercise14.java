package ch09_interfaces.exercise14;
//Exercise 14: (2) Create three interfaces, each with two methods. Inherit a new interface that combines the three,
//adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class.
//Now write four methods, each of which takes one of the four interfaces as an argument. In main( ), create an object
//of your class and pass it to each of the methods.

import static thinkinginjava.Utils.print;

class Base {
}

public class Exercise14 extends Base implements CommonInterface {
    public static void main(String[] args) {
        Exercise14 ex = new Exercise14();
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
