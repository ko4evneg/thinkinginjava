package ch_09_interfaces.exercise13;
//Exercise 13: (2) Create an interface, and inherit two new interfaces from that interface. Multiply inherit a third
//interface from the second two.

interface BaseInt {
    void crawl();
}

interface DerivedOne extends BaseInt {
    void running();
}

interface DerivedTwo extends BaseInt {
    void walk();
}

public interface Derived extends DerivedOne, DerivedTwo {
    void newMethod();
}