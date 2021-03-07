package ch11_holdingyourobjects.exercise13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    // A class from java.util to hold Event objects:
    private List<Event> eventList = new LinkedList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) {
            Iterator<Event> it = new LinkedList<>(eventList).iterator();

            while (it.hasNext()) {
                Event e = it.next();
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
