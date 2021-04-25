package ch11_holdingyourobjects.exercise27;
//Exercise 27: (2) Write a class called Command that contains a String and has a method operation( ) that displays the
//String. Write a second class with a method that fills a Queue with Command objects and returns it. Pass the filled
//Queue to a method in a third class that consumes the objects in the Queue and calls their operation( ) methods.

import java.util.LinkedList;
import java.util.Queue;

import static thinkinginjava.util.Utils.print;

public class Command {
    private String string;

    public Command(String string) {
        this.string = string;
    }

    public void operation() {
        print(string);
    }
}

class QueueUtils {
    public static Queue<Command> fillQueue() {
        Queue<Command> queue = new LinkedList<>();
        queue.offer(new Command("go!"));
        queue.offer(new Command("stay!"));
        queue.offer(new Command("fire!"));
        queue.offer(new Command("down!"));
        queue.offer(new Command("run!"));
        queue.offer(new Command("climb!"));
        return queue;
    }
}

class Init {
    public static void main(String[] args) {
        for (Command command : QueueUtils.fillQueue()) {
            command.operation();
        }
    }
}
