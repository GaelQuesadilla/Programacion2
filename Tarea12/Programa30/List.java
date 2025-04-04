package Tarea12.Programa30;

public class List {
    private Node head;

    public List() {
        this.head = null;
    }

    public void addFirst(String value) {
        Node node = new Node(value);
        node.setNext(this.head);
        this.head = node;
    }

    public void addLast(String value) {
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

    public int search(String target) {
        int index = 0;
        Node current = this.head;
        while (current != null) {

            if (current.getValue().equals(target)) {
                return index;
            }
            current = current.getNext();
            index++;
        }

        return -1;

    }

    public String[] asArray() {
        Node current = this.head;
        String[] array = new String[this.size()];

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

}
