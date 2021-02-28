package ch10_innerclasses.exercise19;
//Exercise 19: (2) Create a class containing an inner class that itself contains an inner class. Repeat this using
//nested classes. Note the names of the .class files produced by the compiler.

public class Exercise19 {
    class InnerOuter {
        class InnerInner {

        }
    }

    static class NestedOuter {
        static class NestedInner {

        }
    }

    public static void main(String[] args) {
        InnerOuter io = new Exercise19().new InnerOuter();
        InnerOuter.InnerInner in = new Exercise19().new InnerOuter().new InnerInner();
        NestedOuter no = new NestedOuter();
        NestedOuter.NestedInner ni = new NestedOuter.NestedInner();

    }
}
