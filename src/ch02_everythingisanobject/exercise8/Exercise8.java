package ch02_everythingisanobject.exercise8;
//Exercise 8: (3) Write a program that demonstrates that, no matter how many objects you create of a particular class,
// there is only one instance of a particular static field in that class.

public class Exercise8 {
    static int staticField = 42;

    public static void main(String[] args) {
        Exercise8 exampleOne = new Exercise8();
        Exercise8 exampleTwo = new Exercise8();
        Exercise8 exampleThree = new Exercise8();

        exampleOne.staticField++;

        System.out.println(exampleOne.staticField);
        System.out.println(exampleTwo.staticField);
        System.out.println(exampleThree.staticField);
    }
}
