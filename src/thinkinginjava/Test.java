package thinkinginjava;

public class Test {
    private void print(){
        System.out.println("void");
    }
}

class TestTwo {
    public static void main(String[] args) {
        Test t = new Test();
        //Error!
        //t.print();
    }
}
