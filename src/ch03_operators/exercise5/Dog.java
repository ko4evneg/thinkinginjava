package ch03_operators.exercise5;
//Exercise 5: (2) Create a class called Dog containing two Strings: name and says. In main( ), create two dog objects
//with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”). Then display their names and what they say.

import static thinkinginjava.Utils.print;

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

        print(String.format("%s says %s!", dogOne.name, dogOne.says));
        print(String.format("%s says %s!", dogTwo.name, dogTwo.says));
    }
}