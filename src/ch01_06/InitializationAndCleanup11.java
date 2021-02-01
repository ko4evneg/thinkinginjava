package ch01_06;

public class InitializationAndCleanup11 {
    public static void main(String[] args) {
        InitializationAndCleanup11 toGc = new InitializationAndCleanup11();
        toGc.finalize();
        System.out.println(toGc);
    }

    protected void finalize() {
        System.out.println(this + " finalized!");
    }
}
