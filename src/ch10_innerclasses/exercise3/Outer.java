package ch10_innerclasses.exercise3;
//Exercise 3: (1) Modify Exercise 1 so that Outer has a private String field (initialized by the constructor), and
//Inner has a toString( ) that displays this field. Create an object of type Inner and display it.

import static thinkinginjava.Utils.print;

public class Outer {
    private String s;

    public Outer() {
        this.s = "la string";
    }

    class Inner {
        int i = 3;

        @Override
        public String toString() {
            return s;
        }
    }

    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().getInner();
        print(inner);
    }
}
