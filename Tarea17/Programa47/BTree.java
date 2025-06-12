package Tarea17.Programa47;

public class BTree {
    /* Cantidad máxima de nodos permitidos */
    private final int grade;

    private Node root;

    /**
     * Constructor básico
     * 
     * @param grade Número máximo de nodos permitidos
     */
    public BTree(int grade) {
        this.grade = grade;
        this.root = new Node(grade);
        this.root.keyCount = 0;
        this.root.isLeaf = true;
    }

    /**
     * Busca el nodo con el valor dado
     * 
     * @param node  Nodo en el que se realizará la búsqueda
     * @param value Valor del nodo a buscar
     * @return Nodo con el valor
     */
    private Node Search(Node node, int value) {
        if (node == null) {
            return node;
        }

        int i = 0;
        for (i = 0; i < node.keyCount; i++) {
            if (value < node.keys[i]) {
                break;
            }
            if (value == node.keys[i]) {
                return node;
            }
        }

        if (node.isLeaf) {
            return null;
        } else {
            return Search(node.child[i], value);
        }
    }

    /**
     * Divide un nodo lleno en dos partes
     * 
     * @param parent       Nodo padre
     * @param index        Índice del nodo padre que apunta al nodo childToSplit
     * @param childToSplit Nodo a dividir
     */
    private void splitChild(Node parent, int index, Node childToSplit) {

        Node rightNode = new Node(this.grade);
        rightNode.isLeaf = childToSplit.isLeaf;

        int midIndex = (this.grade - 1) / 2;

        rightNode.keyCount = (this.grade - 1) - (midIndex + 1);

        for (int j = 0; j < rightNode.keyCount; j++) {
            rightNode.keys[j] = childToSplit.keys[midIndex + 1 + j];
        }

        if (!childToSplit.isLeaf) {
            for (int j = 0; j < rightNode.keyCount; j++) {
                rightNode.child[j] = childToSplit.child[midIndex + 1 + j];
            }

            childToSplit.keyCount = midIndex;
        }

        for (int j = parent.keyCount; j >= index + 1; j--) {
            parent.child[j + 1] = parent.child[j];

        }
        parent.child[index + 1] = rightNode;

        for (int j = parent.keyCount - 1; j >= index; j--) {
            parent.keys[j + 1] = parent.keys[j];
        }
        parent.keys[index] = childToSplit.keys[midIndex];

        parent.keyCount = parent.keyCount + 1;

    }

    // ? insert value
    public void insert(final int key) {
        if (root.keyCount == this.grade - 1) {
            Node newRoot = new Node(this.grade);
            newRoot.isLeaf = false;
            newRoot.keyCount = 0;
            newRoot.child[0] = root;
            splitChild(newRoot, 0, root);
            insertNonFull(newRoot, key);
        } else {
            insertNonFull(root, key);
        }
    }

    /**
     * Inserta un valor en un nodo que no está lleno
     * 
     * @param node  Nodo en el que se inserta el valor
     * @param value Valor a insertar
     */
    final private void insertNonFull(Node node, int value) {

        if (node.isLeaf) {
            int i = node.keyCount - 1;
            while (i >= 0 && value < node.keys[i]) {
                node.keys[i + 1] = node.keys[i];
                i--;
            }
            node.keys[i + 1] = value;
            node.keyCount++;
        } else {
            int i = node.keyCount - 1;
            while (i >= 0 && value < node.keys[i]) {
                i--;
            }
            i++;

            Node nextChild = node.child[i];
            if (nextChild.keyCount == this.grade - 1) {
                splitChild(node, i, nextChild);
                if (value > node.keys[i]) {
                    i++;
                }
            }
            insertNonFull(node.child[i], value);
        }

    }

    public void Show() {
        Show(this.root);
    }

    /**
     * Muestra los hijos de un nodo de manera recursiva
     * 
     * @param node Nodo a mostrar
     */
    private void Show(Node node) {
        assert (node == null);
        for (int i = 0; i < node.keyCount; i++) {
            System.out.print(node.keys[i] + " ");
        }
        if (!node.isLeaf) {
            for (int i = 0; i < node.keyCount + 1; i++) {
                Show(node.child[i]);
            }
        }
    }

    /**
     * Verifica si existe el nodo con el valor dado
     * 
     * @param value Valor a buscar
     * @return true si existe, de lo contrario false
     */
    public boolean Contain(int value) {
        if (this.Search(this.root, value) != null) {
            return true;
        } else {
            return false;
        }
    }

    public void delete(int value) {
        Node node = this.Search(root, value);
        this.delete(node);
    }

    public void delete(Node node) {

    }

}