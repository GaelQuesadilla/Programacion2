package Practicas.Pila.Gael.Programa1;

public class Stack {
    private Node head;

    public Stack() {
        this.head = null;
    }

    public void push(int value) {
        Node node = new Node(value);
        node.setNext(this.head);
        this.head = node;
    }

    public void pop() {
        if (this.head == null) {
            System.err.println("\u001B[31mPila vacia\u001B[0m\n");
            return;
        }
        System.out.printf("Se eliminó el elemento %s\n", this.head.getValue());
        this.head = this.head.getNext();
    }

    public Integer top() {
        if (this.head == null) {
            System.err.println("\u001B[31mPila vacia\u001B[0m\n");
            return null;
        }
        return this.head.getValue();
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

}
