package ch11_holdingyourobjects.exercise29;
//Exercise 29: (2) Create a simple class that inherits from Object and contains no members, and show that you cannot
//successfully add multiple elements of that class to a PriorityQueue. This issue will be fully explained in the
//Containers in Depth chapter.

import java.util.PriorityQueue;

public class AnyClass {
    public static void main(String[] args) {
        PriorityQueue<AnyClass> anyQueue = new PriorityQueue<>();
        //not working:
        //anyQueue.offer(new AnyClass());
    }
}
