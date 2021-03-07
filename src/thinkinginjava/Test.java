package thinkinginjava;

import java.util.*;

import static thinkinginjava.Utils.print;

public class Test {
    public static void main(String[] args) {
        Outer.Nested.pr();
    }
}

class Outer {
    static class Nested {
        static void pr(){
            System.out.println("pr()");
        }
    }
}