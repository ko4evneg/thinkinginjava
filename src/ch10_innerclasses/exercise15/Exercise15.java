package ch10_innerclasses.exercise15;
//Exercise 15: (2) Create a class with a non-default constructor (one with arguments) and no default constructor (no
//"no-arg" constructor). Create a second class that has a method that returns a reference to an object of the first
//class. Create the object that you return by making an anonymous inner class that inherits from the first class.

import static thinkinginjava.util.Utils.print;

class Building {
    public Building(int height) {
        print("Constructing building (height: " + height + ")...");
    }
}

public class Exercise15 {
    Building getHighBuilding(){
        return new Building(100500) {
        };
    }

    public static void main(String[] args) {
        Exercise15 ex = new Exercise15();
        ex.getHighBuilding();
        ex.getHighBuilding();
    }
}
