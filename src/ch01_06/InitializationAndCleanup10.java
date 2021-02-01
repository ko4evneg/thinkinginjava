package ch01_06;
//Exercise 10:
// (2) Create a class with a finalize( ) method that prints a message.
// In main( ), create an object of your class.
// Explain the behavior of your program.

public class InitializationAndCleanup10 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            InitializationAndCleanup10 toGc = new InitializationAndCleanup10();
            toGc = new InitializationAndCleanup10();
        }
    }

    protected void finalize() {
        System.out.println(this + " finalized!");
    }
}
