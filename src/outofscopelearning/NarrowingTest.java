package outofscopelearning;

import static thinkinginjava.Utils.print;

public class NarrowingTest {
    public static void main(String[] args) {
            long lMax = Integer.MAX_VALUE + 30000000;
            long lMid = Integer.MAX_VALUE + 3000000;
            long lNeg = Integer.MIN_VALUE + 1;

            int iMax = (int) lMax;
            int iMid = (int) lMid;
            int iNeg = (int) lNeg;

            print(Integer.MAX_VALUE);
            print(String.format("lMax = %d\n(int) lMax = %d", lMax, iMax));
            print(String.format("lBin = %s\niBin = %s", Long.toBinaryString(lMax), Long.toBinaryString(iMax)));

    }
}
