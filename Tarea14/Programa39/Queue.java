package Tarea14.Programa39;

public class Queue<T> {
    private Node<T> head;

    public Queue() {
        this.head = null;
    }

    public void add(T value) {
        Node<T> node = new Node<T>(value);

        if (this.head == null) {
            this.head = node;
            return;
        }

        Node<T> current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(node);

    }

    public T remove() {
        if (this.head == null) {
            return null;
        }

        T value = this.head.getValue();
        this.head = this.head.getNext();

        return value;

    }

    public T front() {
        if (this.head == null) {
            System.err.println("\u001B[31mCola vacia\u001B[0m\n");
            return null;
        }
        return this.head.getValue();
    }

    public T last() {
        if (this.head == null) {
            System.err.println("\u001B[31mCola vacia\u001B[0m\n");
            return null;
        }
        Node<T> current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        return current.getValue();
    }

    public Object[] asArray() {
        Node<T> current = this.head;
        Object[] array = new Object[this.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = current.getValue();
            current = current.getNext();
        }

        return array;
    }

    public int size() {
        int count = 0;
        Node<T> current = this.head;
        while (current != null) {
            count++;
            current = current.getNext();
        }

        return count;
    }

}
