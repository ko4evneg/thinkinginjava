package ch02_everythingisanobject.exercise5;
//Exercise 5: (1) Modify the previous exercise so that the values of the data in DataOnly are assigned to and printed
//in main( ).

public class Exercise5 {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
    }
}

class DataOnly {
    int i;
    double d;
    boolean b;
}
