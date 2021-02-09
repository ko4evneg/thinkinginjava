package ch06_accesscontrol.exercise8;
//Exercise 8: (4) Following the form of the example Lunch.java, create a class called ConnectionManager that manages a
//fixed array of Connection objects. The client programmer must not be able to explicitly create Connection objects, but
//can only get them via a static method in ConnectionManager. When the ConnectionManager runs out of objects, it returns
//a null reference. Test the classes in main( ).

import static thinkinginjava.Utils.print;

public class ConnectionManager {
    static Connection[] connections = new Connection[10];
    static int i = 0;

    static {
        for (int j = 0; j < 10; j++) {
            connections[j] = new Connection(j);
        }
    }

    static Connection getNewConnection(){
        if (i == 10)
            return null;
        return connections[i++];
    }

    public static void main(String[] args) {
        for (int j = 0; j <= 10; j++) {
            print(getNewConnection().s);
        }
    }
}

class Connection {
    String s;
    Connection(int i){
        s = String.valueOf(i);
    }
}
