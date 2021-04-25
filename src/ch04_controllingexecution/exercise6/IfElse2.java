package ch04_controllingexecution.exercise6;

import static thinkinginjava.util.Utils.print;

public class IfElse2 {
    static int test(int testval, int target, int begin, int end) {
        if (testval >= begin && testval <= end)
            print("Inside a range");
        else
            print("Outside of a range");

        if (testval > target)
            return +1;
        else if (testval < target)
            return -1;
        else
            return 0; // Match
    }

    public static void main(String[] args) {
        print(test(10, 5, 2, 9));
        print(test(5, 10, 6, 456));
        print(test(5, 5, 4, 5));
    }
}
