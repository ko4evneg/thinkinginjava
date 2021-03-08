package thinkinginjava;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();
    public void push(T obj) {
        storage.add(obj);
    }
    public T peek(){
        return storage.getLast();
    }
    public T pop(){
        return storage.removeLast();
    }
    public boolean isEmpty(){
        return storage.isEmpty();
    }
    public String toString() {
        return storage.toString();
    }
}
