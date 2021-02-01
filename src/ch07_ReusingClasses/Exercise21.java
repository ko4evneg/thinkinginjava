package ch07_ReusingClasses;
//Exercise 21: (1) Create a class with a final method. Inherit from that class and attempt to overwrite that method.

public class Exercise21 {
    public static void main(String[] args) {

    }

    final void print() {
        System.out.println("Final print");
    }

    class Exercise21child extends Exercise21 {
//    @Override     //not working as method is final
//    final void print() {
//    }
    }
}




