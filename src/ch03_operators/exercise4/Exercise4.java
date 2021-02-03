package ch03_operators.exercise4;
//Exercise 4: (2) Write a program that calculates velocity using a constant distance and a constant time.

import static thinkinginjava.Utils.print;

public class Exercise4 {
    static final double TIME = 4.3;
    static final double DISTANCE = 1000;
    static double velocity;

    public static void main(String[] args){
        velocity = DISTANCE / TIME;
        print(velocity);
    }
}