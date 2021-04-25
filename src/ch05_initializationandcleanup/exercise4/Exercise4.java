package ch05_initializationandcleanup.exercise4;
//Exercise 4: (1) Add an overloaded constructor to the previous exercise that takes a String argument and
//prints it along with your message.

import static thinkinginjava.util.Utils.print;

public class Exercise4 {
    Exercise4(){
         print("Constructor worked!");
    }
    Exercise4(String s){
        print("Constructor worked! Message: " + s);
    }

    public static void main(String[] args) {
        Exercise4 ex = new Exercise4("an argument");
    }
}
