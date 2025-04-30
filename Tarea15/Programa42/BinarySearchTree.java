package Tarea15.Programa42;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(int value) {
        Node father = this.searchFather(value);
        Node node = new Node(value, father);
        if (this.root == null) {
            this.root = node;
            return;
        }

        if (node.getValue() <= node.getFather().getValue()) {
            node.getFather().setLeftChildren(node);
        } else {
            node.getFather().setRightChildren(node);
        }
    }

    public Node searchNode(int value) {
        Node aux = this.root;
        while (aux.getValue() != value) {
            System.out.printf("%s -> ", aux.getValue());
            if (value < aux.getValue()) {
                aux = aux.getLeftChildren();

            } else {
                aux = aux.getRightChildren();
            }

            if (aux == null) {
                System.out.println("null\nNo se encontró el elemento");
                break;
            }

        }
        System.out.println(value);
        return aux;
    }

    public Node searchFather(int value) {
        Node father = null;
        Node aux = this.root;

        while (aux != null) {
            father = aux;
            if (aux.getValue() > value) {
                aux = aux.getLeftChildren();
                continue;
            }
            aux = aux.getRightChildren();

        }

        return father;

    }

    public boolean delete(Node node) {
        boolean hasRightChildren = node.getRightChildren() != null;
        boolean hasLeftChildren = node.getLeftChildren() != null;

        if (!hasLeftChildren && !hasRightChildren) {

            return deleteCase1(node);
        }

        if (hasLeftChildren && hasRightChildren) {

            return deleteWithBothChildren(node);
        }

        return deleteWithChildren(node);
    }

    public boolean deleteCase1(Node node) {

        Node leftChildren = node.getFather().getLeftChildren();
        Node rightChildren = node.getFather().getRightChildren();

        if (leftChildren == node) {
            node.getFather().setLeftChildren(null);
            return true;
        }
        if (rightChildren == node) {
            node.getFather().setRightChildren(null);
            return true;
        }

        return false;
    }

    // Delete case 2
    public boolean deleteWithChildren(Node node) {

        Node leftChildren = node.getFather().getLeftChildren();
        Node rightChildren = node.getFather().getRightChildren();

        Node currentChildren;

        if (node.getLeftChildren() != null) {
            currentChildren = node.getLeftChildren();
        } else {
            currentChildren = node.getRightChildren();
        }

        if (leftChildren == node) {
            node.getFather().setLeftChildren(currentChildren);
            currentChildren.setFather(node.getFather());
            node.setChildren(new Node[] { null, null });
            return true;
        }
        if (rightChildren == node) {
            node.getFather().setRightChildren(currentChildren);
            currentChildren.setFather(node.getFather());
            node.setChildren(new Node[] { null, null });
            return true;
        }

        return false;

    }

    // Delete case 3
    public boolean deleteWithBothChildren(Node node) {

        Node leftNode = this.travelLeft(node.getRightChildren());
        System.out.printf("El nodo remplazo es: %s\n", leftNode.getValue());

        if (leftNode != null) {
            node.setValue(leftNode.getValue());
            this.delete(leftNode);
            return true;
        }
        return false;

    }

    public Node travelLeft(Node node) {
        if (node.getLeftChildren() == null) {
            return node;
        }
        return travelLeft(node.getLeftChildren());

    }

    public void printPreOrder() {
        this.printPreOrder(root);
    }

    private void printPreOrder(Node node) {
        if (node != null) {
            System.out.println(node.getValue());
            printPreOrder(node.getLeftChildren());
            printPreOrder(node.getRightChildren());
        }
    }

    public void printOrder() {
        this.printOrder(root);
    }

    private void printOrder(Node node) {
        if (node != null) {
            this.printOrder(node.getLeftChildren());
            System.out.println(node.getValue());
            this.printOrder(node.getRightChildren());
        }
    }

    public void printPosOrden() {
        this.printPosOrden(root);
    }

    public void printPosOrden(Node node) {
        if (node != null) {
            printPosOrden(node.getRightChildren());
            printPosOrden(node.getLeftChildren());
            System.out.println(node.getValue());
        }
    }

}
