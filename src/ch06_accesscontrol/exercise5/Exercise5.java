package ch06_accesscontrol.exercise5;
//Exercise 5: (2) Create a class with public, private, protected, and package-access fields and
//method members. Create an object of this class and see what kind of compiler messages you get
//when you try to access all the class members. Be aware that classes in the same directory are
//part of the “default” package.

import ch06_accesscontrol.exercise5.testpack.AccessModifiersClass;
import static thinkinginjava.util.Utils.print;

public class Exercise5 {
    public static void main(String[] args) {
        AccessModifiersClass a = new AccessModifiersClass();
        print(a.publ);

        //Error:(15, 16) java: priv has private access in ch06_accesscontrol.exercise5.testpack.AccessModifiersClass
        //print(a.priv);

        //Error:(19, 16) java: pack is not public in ch06_accesscontrol.exercise5.testpack.AccessModifiersClass; cannot be accessed from outside package
        //print(a.pack);

        //Error:(21, 16) java: prot has protected access in ch06_accesscontrol.exercise5.testpack.AccessModifiersClass
        //print(a.prot);
    }
}
