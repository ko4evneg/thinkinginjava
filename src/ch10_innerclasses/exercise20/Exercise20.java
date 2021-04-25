package ch10_innerclasses.exercise20;
//Exercise 20: (1) Create an interface containing a nested class. Implement this interface and create an instance of
//the nested class.

import static thinkinginjava.util.Utils.print;

public interface Exercise20 {
    //implicitly static and public
    class NestedClass implements Exercise20 {
        public static void main(String[] args) {
            NestedClass nc = new NestedClass();
            nc.test();
        }

        void test() {
            print("Testing...");
        }
    }
}

class Testing{
    public static void main(String[] args) {
        Exercise20.NestedClass nc = new Exercise20.NestedClass();
        nc.test();
    }
}
