package ch07_ReusingClasses;
//Exercise 18: (2) Create a class with a static final field and a final field
// and demonstrate the difference between the two.
public class Exercise18 {
    public static void main(String[] args) {
        StaticTest test1 = new StaticTest();
        StaticTest test2 = new StaticTest();

        System.out.println(test1);
        System.out.println(test2);
    }
}

class StaticTest {
    public final double i = Math.random();
    public static final String string = "That's da stinga";

    @Override
    public String toString() {
        return "StaticTest{" +
                "i= " + i + "; string = " + string +
                '}';
    }
}