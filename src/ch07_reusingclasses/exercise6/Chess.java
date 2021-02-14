package ch07_reusingclasses.exercise6;

import static thinkinginjava.Utils.print;
//Exercise 6: (1) Using Chess.java, prove the statements in the previous paragraph.

class Game {
    Game(int i) {
        print("Game constructor");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("BoardGame constructor");
    }
}
public class Chess extends BoardGame {
    Chess() {
        //compiler error when base-class constructor call is commented out
        super(11);
        print("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
