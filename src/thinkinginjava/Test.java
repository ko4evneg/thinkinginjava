package thinkinginjava;

class Outer {
    public static int i = 0;

    class Inner{
        public Inner() {
            i++;
        }
        void print() {
            System.out.println(i);
        }
        @Override
        public String toString() {
            return String.valueOf(this.hashCode() + i);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer o2 = new Outer();
        Outer.Inner arr[] = new Outer.Inner[4];
        arr[0] = o1.new Inner();
        arr[1] = o1.new Inner();
        arr[2] = o2.new Inner();
        arr[3] = o2.new Inner();
        o1 = null;
        for (Outer.Inner inner : arr) {
            inner.print();
        }
    }
}