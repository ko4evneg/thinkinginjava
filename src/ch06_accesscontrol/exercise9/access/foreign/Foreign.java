package ch06_accesscontrol.exercise9.access.foreign;
//Exercise 9: (2) Create the following file in the access/local directory (presumably in your CLASSPATH)
//Then create the following file in a directory other than access/local:
//Explain why the compiler generates an error. Would making the Foreign class part of the access.local
// package change anything?

import ch06_accesscontrol.exercise9.access.local.*;

public class Foreign {
    public static void main(String[] args) {
        //Package should be the same, or public access should be given to PackagedClass
        //PackagedClass pc = new PackagedClass();
    }
}
