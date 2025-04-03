package Practicas.LinkedList.Gael.Programa2;

import java.util.LinkedList;

public class List {
    private LinkedList<Integer> list = new LinkedList<Integer>();

    public void addFirst(int value) {
        this.list.addFirst(value);
    }

    public void addLast(int value) {
        this.list.addLast(value);
    }

    public void removeFirst() {
        if (this.list.isEmpty()) {
            System.out.println("Lista vacia");
            return;
        }

        this.list.removeFirst();
    }

    public void pop() { // removeLast
        if (this.list.isEmpty()) {
            System.out.println("Lista vacia");
            return;
        }

        this.list.removeLast();
    }

    public Object[] asArray() {
        return this.list.toArray();
    }

    public int size() {
        return this.list.size();
    }

    public void insert(int value, int index) {
        this.list.add(index, value);
    }

    public void remove(int index) {
        this.list.remove(index);
    }

}
