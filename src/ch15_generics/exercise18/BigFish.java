package ch15_generics.exercise18;

import thinkinginjava.util.Generator;

public class BigFish {
    private static int counter = 1;
    private int id = counter++;

    private BigFish() {
    }

    public static Generator<BigFish> bigFishGen() {
        return BigFish::new;
    }
    @Override
    public String toString() {
        return "Big fish #" + id;
    }
}
