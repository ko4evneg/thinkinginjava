package ch08_polymorphism.exercise16;
//Exercise 16: (3) Following the example in Transmogrify.java, create a Starship class containing an AlertStatus
//reference that can indicate three different states. Include methods to change the states.

import static thinkinginjava.Utils.print;

class AlertState {
    void light() {
    }

    ;
}

class RedAlert extends AlertState {
    void light() {
        print("Red Alert");
    }

    ;
}

class GreenLight extends AlertState {
    void light() {
        print("Green Light");
    }

    ;
}

class YellowAlert extends AlertState {
    void light() {
        print("Yellow Alert");
    }

    ;
}

public class Starship {
    //Show state of an object, while inheritance declares differences in behaviour
    private static AlertState alertState = new GreenLight();

    static void toYellow() {
        alertState = new YellowAlert();
    }

    static void toRed() {
        alertState = new RedAlert();
    }

    public static void main(String[] args) {
        alertState.light();
        toYellow();
        alertState.light();
        toRed();
        alertState.light();
    }
}