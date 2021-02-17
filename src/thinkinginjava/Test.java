package thinkinginjava;
import static thinkinginjava.Utils.print;

class Base {
    int i = 0;
}

public class Test extends Base {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
    public void show(){
        this.i++;
        super.i++;
    }
}