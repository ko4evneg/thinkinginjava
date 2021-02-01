package ch07_ReusingClasses;
//Exercise 23: (2) Prove that class loading takes place only once. Prove that loading may be caused by either
//the creation of the first instance of that class or by the access of a static member.

public class Exercise23 {
    public static void main(String[] args) {
        //ToLoadClass tlc = new ToLoadClass();
        System.out.println(ToLoadClass.i);
    }
}

class ToLoadClass {
    public static int i = 1;
    public static int j = calc();
    ToLoadClass () {
        System.out.println("Constructor has run");
    }

    private static int calc() {
        return 5;
    }
}
