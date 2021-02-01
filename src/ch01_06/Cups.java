package ch01_06;

class Cups {
    static Cup cup1;
    static Cup cup2;
    static Cup cup3 = new Cup(22);
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }
}
