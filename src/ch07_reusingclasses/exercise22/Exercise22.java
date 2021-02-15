package ch07_reusingclasses.exercise22;

final class Base {
    void test(){}
}

//Can't compile!
//public class Exercise22 extends Base{
//}

public class Exercise22 {
    Base b = new Base();
}

