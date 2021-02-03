package ch03_operators.exercise9;

import static thinkinginjava.Utils.print;

//Exercise 9: (1) Display the largest and smallest numbers for both float and double exponential notation.
public class Exercise9 {
    public static void main(String[] args) {
        float fMin = Float.MIN_EXPONENT;
        float fMax = Float.MAX_EXPONENT;
        double dMin = Double.MIN_EXPONENT;
        double dMax = Double.MAX_EXPONENT;

        print(String.format("fMin: %f\n" +
                "fMax: %f\n" +
                "dMin: %f\n" +
                "dMax: %f\n", fMin, fMax, dMin, dMax));
    }
}
