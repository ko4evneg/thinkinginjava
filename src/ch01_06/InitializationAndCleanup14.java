package ch01_06;

public class InitializationAndCleanup14 {
//(1) Create a class with a static String field that is initialized at the point of definition,
//and another one that is initialized by the static block. Add a static method that prints both
//fields and demonstrates that they are both initialized before they are used.
    static String str1 = "Init at definition";
    static String str2;

    static {
        str2 = "Init in static block";
    }

    static void getStrs () {
        System.out.println(str1 + "\n" + str2);
    }

    public static void main(String[] args) {
        InitializationAndCleanup14.getStrs();
    }
}
