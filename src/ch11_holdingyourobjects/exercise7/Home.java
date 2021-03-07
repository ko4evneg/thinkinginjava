package ch11_holdingyourobjects.exercise7;
//Exercise 7: (3) Create a class, then make an initialized array of objects of your class. Fill a List from your array.
//Create a subset of your List by using subList( ), then remove this subset from your List.

import java.util.*;

import static thinkinginjava.Utils.print;

public class Home {
    static Home[] homes = new Home[]{new Home("a"),new Home("b"),new Home("c"),new Home("d"),new Home("f")};

    private String name;
    public Home(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<Home> homesList = new ArrayList<>();
        Collections.addAll(homesList, homes);
        print(homesList);
        List<Home> subset = homesList.subList(2,4);
        homesList.removeAll(subset);
        print(homesList);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name;
    }
}
