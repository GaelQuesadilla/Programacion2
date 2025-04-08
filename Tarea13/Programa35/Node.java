package Tarea13.Programa35;

public class Node {
    private Dog value;
    private Node next;

    public Node() {
        this.next = null;
    }

    public Node(Dog value) {
        this.value = value;
        this.next = null;
    }

    public Dog getValue() {
        return value;
    }

    public void setValue(Dog value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
