package ch07_ReusingClasses;

public class Exercise8 {
    public static void main(String[] args) {
        new Derived();
        new Derived("contructa");
    }

    static class Base {
        public Base(String s) {
            System.out.println(s);
        }
    }

    static class Derived extends Base {
        public Derived(String s) {
            super(s);
        }

        public Derived() {
            super("Default values");
        }
    }
}
