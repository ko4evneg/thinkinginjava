package ch10_innerclasses.exercise21;
//Exercise 21: (2) Create an interface that contains a nested class that has a static method that calls the methods of
//your interface and displays the results. Implement your interface and pass an instance of your implementation to the
//method.

import static thinkinginjava.util.Utils.print;

public interface Exercise21 {
    class NestedClass{
        static void displayTest(Exercise21 ex) {
            ex.test();
        }
    }

    void test();
}

class Init{
    public static void main(String[] args) {
        Exercise21.NestedClass.displayTest(
                //Anonymous class interface implementation
                new Exercise21() {
                    @Override
                    public void test() {
                        print("Testing");
                    }
                }
        );
    }
}

