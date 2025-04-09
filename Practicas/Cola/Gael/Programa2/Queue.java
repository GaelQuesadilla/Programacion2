package Practicas.Cola.Gael.Programa2;

import java.util.Deque;
import java.util.LinkedList;

public class Queue<T> {
    private Deque<T> queue = new LinkedList<T>();

    public void add(T value) {
        this.queue.add(value);

    }

    public T remove() {

        if (this.queue.isEmpty()) {
            return null;
        }
        return this.queue.remove();

    }

    public T front() {
        if (this.queue.isEmpty()) {
            System.err.println("\u001B[31mPila vacia\u001B[0m\n");
            return null;
        }
        return this.queue.getFirst();
    }

    public T last() {
        if (this.queue.isEmpty()) {
            System.err.println("\u001B[31mPila vacia\u001B[0m\n");
            return null;
        }

        return this.queue.getLast();
    }

    public Object[] asArray() {
        return this.queue.toArray();
    }

    public int size() {
        return this.queue.size();
    }

}
