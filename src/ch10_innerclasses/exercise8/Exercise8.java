package ch10_innerclasses.exercise8;
//Exercise 8: (2) Determine whether an outer class has access to the private elements of its inner class.

import static thinkinginjava.util.Utils.print;

public class Exercise8 {
    private int x = 12;
    private void outInner() {
        Exercise8.Inner i = new Inner();
        print(i.x + "\n------\n");
        i.outX();
    }

    class Inner {
        private int x = 3;
        private void outX () {
            print(Exercise8.this.x);
            print(this.x);
        }
    }

    public static void main(String[] args) {
        Exercise8 ex = new Exercise8();
        ex.outInner();
    }
}
