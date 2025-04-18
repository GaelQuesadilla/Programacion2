package Practicas.LinkedList.Gael.Programa1;

public class Node {
    private int value;
    private Node next;

    public Node() {
        this.next = null;
    }

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
