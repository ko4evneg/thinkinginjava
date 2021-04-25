package ch11_holdingyourobjects.exercise28;
//Exercise 28: (2) Fill a PriorityQueue (using offer( )) with Double values created using java.util.Random, then remove
//the elements using poll( ) and display them.

import java.util.*;

import static thinkinginjava.util.Utils.print;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>();
        Random rand = new Random(10);
        for (int i = 0; i < 15; i++) {
            double r = Math.round(rand.nextDouble() * 100.0) / 100.0;
            doubleQueue.offer(r);
        }
        print(doubleQueue);
        for (int i = 0; i < 15; i++) {
            print(doubleQueue.poll());
        }
    }
}
