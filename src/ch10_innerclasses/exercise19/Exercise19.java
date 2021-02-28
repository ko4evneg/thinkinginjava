package ch10_innerclasses.exercise19;
//Exercise 19: (2) Create a class containing an inner class that itself contains an inner class. Repeat this using
//nested classes. Note the names of the .class files produced by the compiler.

import static thinkinginjava.Utils.print;

public class Exercise19 {
    static int staticInt = 23;
    int instanceInt = 42;


    class InnerOuter {
        class InnerInner {
            private int modifier = 2;
            public InnerInner() {
                print(staticInt + modifier);
                print(instanceInt + modifier);
            }
        }
        //can't:
        //static class AnyClass{}
    }

    static class NestedOuter {
        static class InnerNested {
            private int modifier = 1;
            public InnerNested() {
                print(staticInt + modifier);
                //can't:
                //print(instanceInt);
            }
        }
        class InnerInner {
        }
    }

    public static void main(String[] args) {
        InnerOuter innerClass = new Exercise19().new InnerOuter();
        //outer class instance required for creating inner class
        InnerOuter.InnerInner innerInInner = innerClass.new InnerInner();

        NestedOuter nestedClass = new NestedOuter();
        //nested class created without outer class instance
        NestedOuter.InnerNested nestedInNested = new NestedOuter.InnerNested();
        NestedOuter.InnerInner innerInNested = nestedClass.new InnerInner();
    }
}
