package Tarea15.Programa42;

public class Node {
    private int value;
    private Node father;
    private Node[] children = new Node[2];

    public int getValue() {
        return value;
    }

    public Node(int value, Node father, Node[] children) {
        this.value = value;
        this.father = father;
        this.children = children;
    }

    public Node(int value, Node father) {
        this.value = value;
        this.father = father;
    }

    public Node(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public Node[] getChildren() {
        return children;
    }

    public Node getLeftChildren() {
        return children[0];
    }

    public Node getRightChildren() {
        return children[1];
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }

    public void setLeftChildren(Node children) {
        this.children[0] = children;
    }

    public void setRightChildren(Node children) {
        this.children[1] = children;
    }

}
