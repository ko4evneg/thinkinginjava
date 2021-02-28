package ch10_innerclasses.exercise18;
//Exercise 18: (1) Create a class containing a nested class. In main( ), create an instance of the nested class.

import static thinkinginjava.Utils.print;

class Outer {
    int i = 5;
    static int z = 20;
    static class Nested {
        int a = 4;
        static int y = 43;

        String printOuter(){
            return String.valueOf(Outer.z);
            //can't:
            //print(Outer.this.i);
        }
    }
}

public class Exercise18 {
    public static void main(String[] args) {
        Outer.Nested nested = new Outer.Nested();
        print(nested.a + ":" + nested.y + ":" + nested.printOuter());
    }
}
