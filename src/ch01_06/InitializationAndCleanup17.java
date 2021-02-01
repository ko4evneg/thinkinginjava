package ch01_06;

//Exercise 17: (2) Create a class with a constructor that takes a String argument. During construction,
//print the argument. Create an array of object references to this class, but don’t actually create
//objects to assign into the array. When you run the program, notice whether the initialization messages
//from the constructor calls are printed.

class InitializationAndCleanup17 {
    InitializationAndCleanup17(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        InitializationAndCleanup17[] arr;
        System.out.println("arr[] declared");
        arr = new InitializationAndCleanup17[]{new InitializationAndCleanup17("init value")};
    }
}
