package Tarea15.Programa43;

public class Node {
    private Product value;
    private Node father;
    private Node[] children = new Node[2];

    public Product getValue() {
        return value;
    }

    public Node(Product value, Node father, Node[] children) {
        this.value = value;
        this.father = father;
        this.children = children;
    }

    public Node(Product value, Node father) {
        this.value = value;
        this.father = father;
    }

    public Node(Product value) {
        this.value = value;
    }

    public void setValue(Product value) {
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
