package ch06_accesscontrol.exercise6;

import static thinkinginjava.util.Utils.print;

public class ProtData {
    protected static int data = 5;
}

class ProtDataChange {
    static void changeData(){
        print(ProtData.data);
        ProtData.data = 10;
        print(ProtData.data);
    }
}
