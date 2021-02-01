package ch04_ControllingExecution.Exercise6;
//Exercise 6: (2) Modify the two test( ) methods in the previous two programs so that they take two extra arguments,
//begin and end, and so that testval is tested to see if it is within the range between (and including) begin and end.

import static thinkinginjava.Utils.print;

public class IfElse {
    static int result = 0;

    static void test(int testval, int target, int begin, int end) {
        if (testval > target)
            result = +1;
        else if (testval < target)
            result = -1;
        else
            result = 0; // Match
        if (testval >= begin && testval <= end)
            print("Inside a range");
        else
            print("Outside of a range");
    }

    public static void main(String[] args) {
        test(10, 5, 0, 11);
        print(result);
        test(5, 10, 0, 4);
        print(result);
        test(5, 5, 1, 6);
        print(result);
    }
}
