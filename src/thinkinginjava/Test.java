package thinkinginjava;

class Java{
    private int i = 1;

    class Inner {
        public void out() {
            System.out.println(i++);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Java.Inner inner = new Java().new Inner();
        Java.Inner inner2 = new Java().new Inner();

        inner.out();
        inner2.out();
        inner.out();
        inner2.out();
    }
}
