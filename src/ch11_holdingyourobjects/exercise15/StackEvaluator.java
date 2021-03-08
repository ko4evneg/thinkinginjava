package ch11_holdingyourobjects.exercise15;
//Exercise 15: (4) Stacks are often used to evaluate expressions in programming languages. Using net.mindview.util.
//Stack, evaluate the following expression, where’+’ means "push the following letter onto the stack," and’-’ means "pop
//the top of the stack and print it": "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"


import thinkinginjava.Stack;

import static thinkinginjava.Utils.print;

public class StackEvaluator {
    private static final String EXPRESSION = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—".replaceAll("—","-");
    private static Stack<String> stack = new Stack();
    public static void main(String[] args) {
        evaluateExpression(EXPRESSION);
    }

    private static void evaluateExpression(String s) {
        if (s == null)
            return;
        if (s.charAt(0) == '+') {
            stack.push(s.substring(1, 2));
            if (s.length() >= 3)
                evaluateExpression(s.substring(2,s.length() - 1));
        } else if (s.charAt(0) == '-') {
            print(stack.pop());
            if (s.length() >= 2)
                evaluateExpression(s.substring(1,s.length() - 1));
        }
    }
}

