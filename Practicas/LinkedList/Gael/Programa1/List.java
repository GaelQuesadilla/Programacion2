package Practicas.LinkedList.Gael.Programa1;

public class List {
    private Node head;

    public List() {
        this.head = null;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        node.setNext(this.head);
        this.head = node;
    }

    public void addLast(int value) {
        Node node = new Node(value);

        if (this.head == null) {
            this.head = node;
            return;
        }

        Node current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(node);

    }

    public void removeFirst() {
        if (this.head == null)
            return;

        this.head = this.head.getNext();
    }

    public void pop() { // removeLast
        if (this.head == null)
            return;
        if (this.head.getNext() == null) {
            this.head = null;
            return;
        }

        Node current = this.head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);

    }

    public int search(int target) {
        int index = -1;
        int i = 0;
        Node current = this.head;
        while (current != null) {
            if (current.getValue() == target) {
                index = i;
                break;
            }
            current = current.getNext();
            i++;
        }

        return index;

    }

    public Integer[] asArray() {
        Node current = this.head;
        Integer[] array = new Integer[this.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = current.getValue();
            current = current.getNext();
        }

        return array;
    }

    public int size() {
        int count = 0;
        Node current = this.head;
        while (current != null) {
            count++;
            current = current.getNext();
        }

        return count;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            this.addFirst(value);
            return;
        }
        Node node = new Node(value);
        Node current = this.head;
        int count = 1;
        while (current != null && count < index) {
            current = current.getNext();
            count++;
        }

        if (current == null) {
            return;
        }
        node.setNext(current.getNext());
        current.setNext(node);

    }

}
