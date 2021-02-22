package ch10_innerclasses.exercise5;

public class Outer {
    class Inner {
        Outer getOuter() {
            return Outer.this;
        }
    }
}
