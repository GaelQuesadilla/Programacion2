package Tarea12.Programa30;

public class Node {
    private String value;
    private Node next;

    public Node() {
        this.value = null;
        this.next = null;
    }

    public Node(String value) {
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
