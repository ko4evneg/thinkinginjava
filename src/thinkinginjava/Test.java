package thinkinginjava;

interface Java{
    static class NestedInClass {
        public NestedInClass() {
            System.out.println("nested in interface");
        }
    }

    class InnerInClass {
        public InnerInClass() {
            System.out.println("inner in interface");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Java.NestedInClass j = new Java.NestedInClass();
        Java.InnerInClass i = new Java.InnerInClass();
    }
}
