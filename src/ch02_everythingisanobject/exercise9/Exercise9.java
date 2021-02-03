package ch02_everythingisanobject.exercise9;
//Exercise 9: (2) Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.

public class Exercise9 {
    static int staticField = 42;

    public static void main(String[] args) {
        Short sh = 1;
        Byte b = 2;
        Integer i = 3;
        Long l = 4L;
        Boolean bool = true;
        Character ch = 'a';
        Float f = 3.4f;
        Double d = 1.2;

        System.out.println(sh);
        System.out.println(b);
        System.out.println(i);
        System.out.println(l);
        System.out.println(bool);
        System.out.println(ch);
        System.out.println(f);
        System.out.println(d);
    }
}
