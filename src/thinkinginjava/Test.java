package thinkinginjava;

public class Test {
    public int i = 0;

    interface Iface {void print();}

    class Inner implements Iface{
        public void print(){
            System.out.println(++i);
        }
    }

    Iface getInn1(){
        return new Inner();
    }

    Iface getInn2(){
        return new Iface(){
            @Override
            public void print() {
                System.out.println(++i);
            }
        };
    }

    public static void main(String[] args) {
        Test t = new Test();
        Iface i = t.getInn1();
        Iface j = t.getInn2();
        Iface k = t.getInn1();
        i.print();
        j.print();
        k.print();
        Inner a = t.new Inner();
        a.print();
    }
}