package Tarea12.Programa33;

import java.util.LinkedList;

public class List {
    private LinkedList<Article> list = new LinkedList<Article>();

    public void addFirst(Article value) {
        this.list.addFirst(value);
    }

    public void addLast(Article value) {
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

    public void insert(Article value, int index) {
        this.list.add(index, value);
    }

    public void remove(int index) {
        this.list.remove(index);
    }

    public int searchByName(String name) {
        int index = 0;
        for (Article article : list) {
            if (article.getName().equals(name)) {
                return index;
            }
            index++;
        }
        return -1;
    }

}
