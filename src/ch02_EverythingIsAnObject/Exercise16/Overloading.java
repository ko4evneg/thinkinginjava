package ch02_EverythingIsAnObject.Exercise16;
//Exercise 16: (1) In the Initialization & Cleanup chapter, locate the Overloading.java example and add Javadoc
//documentation. Extract this comment documentation into an HTML file using Javadoc and view it with your Web browser.

//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.

class Tree {
    int height;
    Tree() {
        System.out.println("Planting a seedling");
        System.out.println();
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " +
                height + " feet tall");
    }
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}
/**
 * Class Overloading documentation
 */
public class Overloading {
    /** Method for printing
     * @param args Command line aguments
     * */
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
// Overloaded constructor:
        new Tree();
    }
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~