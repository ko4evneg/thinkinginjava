package thinkinginjava;
import static thinkinginjava.Utils.print;

interface Base {
    int i = 43;
}

public class Test implements Base {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }


    public void show(){
        print(this.i);
    }
}