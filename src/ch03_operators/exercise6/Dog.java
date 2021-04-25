package ch03_operators.exercise6;
//Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object. Test for comparison
//using == and equals( ) for all references.

import static thinkinginjava.util.Utils.print;

public class Dog {
    String name;
    String says;

    public static void main(String[] args){
        Dog dogOne = new Dog();
        dogOne.name = "spot";
        dogOne.says = "Ruff!";
        Dog dogTwo = new Dog();
        dogTwo.name = "scruffy";
        dogTwo.says = "Wurf!";

        Dog dogThree = dogOne;
        dogThree.name = "crag";

        print("dogOne = dogTwo: " + (dogOne == dogTwo));
        print("dogOne = dogThree: " + (dogOne == dogThree));
        print("dogTwo = dogThree: "  + (dogTwo == dogThree));

    }
}