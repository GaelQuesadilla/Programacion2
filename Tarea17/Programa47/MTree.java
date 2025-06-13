package Tarea17.Programa47;

public class MTree {
    /* Cantidad máxima de nodos permitidos */
    private final int grade;

    private Node root;

    /**
     * Constructor básico
     * 
     * @param grade Número máximo de nodos permitidos
     */
    public MTree(int grade) {
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
            if (value < node.keys[i].ID) {
                break;
            }
            if (value == node.keys[i].ID) {
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

        // Claves a la derecha del medio
        rightNode.keyCount = childToSplit.keyCount - midIndex - 1;
        for (int j = 0; j < rightNode.keyCount; j++) {
            rightNode.keys[j] = childToSplit.keys[midIndex + 1 + j];
        }

        if (!childToSplit.isLeaf) {
            for (int j = 0; j <= rightNode.keyCount; j++) {
                rightNode.child[j] = childToSplit.child[midIndex + 1 + j];
            }
        }

        childToSplit.keyCount = midIndex;

        for (int j = parent.keyCount; j >= index + 1; j--) {
            parent.child[j + 1] = parent.child[j];
        }
        parent.child[index + 1] = rightNode;

        for (int j = parent.keyCount - 1; j >= index; j--) {
            parent.keys[j + 1] = parent.keys[j];
        }
        parent.keys[index] = childToSplit.keys[midIndex];

        parent.keyCount++;
    }

    // ? insert value
    public void insert(final Furniture key) {
        if (root.keyCount == this.grade - 1) {
            Node newRoot = new Node(this.grade);
            newRoot.isLeaf = false;
            newRoot.keyCount = 0;
            newRoot.child[0] = root;
            splitChild(newRoot, 0, root);
            root = newRoot;
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
    final private void insertNonFull(Node node, Furniture value) {

        int i = node.keyCount - 1;

        if (node.isLeaf) {
            while (i >= 0 && value.ID < node.keys[i].ID) {
                node.keys[i + 1] = node.keys[i];
                i--;
            }
            node.keys[i + 1] = value;
            node.keyCount++;
        } else {
            while (i >= 0 && value.ID < node.keys[i].ID) {
                i--;
            }
            i++;

            if (node.child[i].keyCount == this.grade - 1) {
                splitChild(node, i, node.child[i]);
                if (value.ID > node.keys[i].ID) {
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
        System.out.println("Hoja:");
        for (int i = 0; i < node.keyCount; i++) {
            System.out.print(node.keys[i] + (i < node.keyCount - 1 ? ", " : "\n"));
        }

        if (!node.isLeaf) {

            System.out.println("\n[");
            for (int i = 0; i < node.keyCount + 1; i++) {
                Show(node.child[i]);
            }
            System.out.println("\n]");
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
        if (root == null)
            return;
        delete(root, value);
        // Ajustar raíz vacía
        if (root.keyCount == 0) {
            if (!root.isLeaf)
                root = root.child[0];
            else
                root = null;
        }
    }

    private void delete(Node node, int value) {
        int idx = findKey(node, value);

        // Caso A: clave está en este nodo
        if (idx < node.keyCount && node.keys[idx].ID == value) {
            if (node.isLeaf) {
                removeFromLeaf(node, idx);
            } else {
                removeFromNonLeaf(node, idx);
            }
        }
        // Caso B: clave no está aquí
        else {
            if (node.isLeaf)
                return; // no existe
            boolean last = (idx == node.keyCount);
            // Asegurar que child[idx] tiene al menos t-1 claves
            fill(node, idx);
            // Tras fill/merge, decidir dónde seguir borrando
            if (last && idx > node.keyCount) {
                delete(node.child[idx - 1], value);
            } else {
                delete(node.child[idx], value);
            }
        }
    }

    private int findKey(Node node, int value) {
        int idx = 0;
        while (idx < node.keyCount && node.keys[idx].ID < value) {
            idx++;
        }
        return idx;
    }

    private void removeFromLeaf(Node node, int idx) {
        for (int i = idx + 1; i < node.keyCount; i++) {
            node.keys[i - 1] = node.keys[i];
        }
        node.keyCount--;
    }

    private void removeFromNonLeaf(Node node, int idx) {
        int value = node.keys[idx].ID;
        int t = (grade + 1) / 2; // mínimo hijos
        int minKeys = t - 1; // mínimo claves

        // 1) Hijo izquierdo tiene suficientes claves
        if (node.child[idx].keyCount >= minKeys + 1) {
            int pred = getPredecessor(node, idx);
            node.keys[idx].ID = pred;
            delete(node.child[idx], pred);
        }
        // 2) Hijo derecho tiene suficientes claves
        else if (node.child[idx + 1].keyCount >= minKeys + 1) {
            int succ = getSuccessor(node, idx);
            node.keys[idx].ID = succ;
            delete(node.child[idx + 1], succ);
        }
        // 3) Ambos hijos tienen sólo minKeys → fusionar
        else {
            merge(node, idx);
            delete(node.child[idx], value);
        }
    }

    private int getPredecessor(Node node, int idx) {
        Node cur = node.child[idx];
        while (!cur.isLeaf) {
            cur = cur.child[cur.keyCount];
        }
        return cur.keys[cur.keyCount - 1].ID;
    }

    private int getSuccessor(Node node, int idx) {
        Node cur = node.child[idx + 1];
        while (!cur.isLeaf) {
            cur = cur.child[0];
        }
        return cur.keys[0].ID;
    }

    private void fill(Node node, int idx) {
        int t = (grade + 1) / 2;
        int minKeys = t - 1;

        // Préstamo de hermano izquierdo
        if (idx > 0 && node.child[idx - 1].keyCount >= minKeys + 1) {
            borrowFromPrev(node, idx);
        }
        // Préstamo de hermano derecho
        else if (idx < node.keyCount && node.child[idx + 1].keyCount >= minKeys + 1) {
            borrowFromNext(node, idx);
        }
        // Ningún hermano puede prestar → fusionar
        else {
            if (idx < node.keyCount)
                merge(node, idx);
            else
                merge(node, idx - 1);
        }
    }

    private void borrowFromPrev(Node node, int idx) {
        Node child = node.child[idx];
        Node sibling = node.child[idx - 1];

        // Mover en child todas sus claves un puesto a la derecha
        for (int i = child.keyCount - 1; i >= 0; i--) {
            child.keys[i + 1] = child.keys[i];
        }
        if (!child.isLeaf) {
            for (int i = child.keyCount; i >= 0; i--) {
                child.child[i + 1] = child.child[i];
            }
        }
        // Traer clave del padre
        child.keys[0] = node.keys[idx - 1];
        if (!child.isLeaf) {
            child.child[0] = sibling.child[sibling.keyCount];
        }
        // Mover clave de sibling al padre
        node.keys[idx - 1] = sibling.keys[sibling.keyCount - 1];
        child.keyCount++;
        sibling.keyCount--;
    }

    private void borrowFromNext(Node node, int idx) {
        Node child = node.child[idx];
        Node sibling = node.child[idx + 1];

        // Traer clave del padre
        child.keys[child.keyCount] = node.keys[idx];
        if (!child.isLeaf) {
            child.child[child.keyCount + 1] = sibling.child[0];
        }
        // Mover primero de sibling al padre
        node.keys[idx] = sibling.keys[0];

        // Desplazar sibling una posición a la izquierda
        for (int i = 1; i < sibling.keyCount; i++) {
            sibling.keys[i - 1] = sibling.keys[i];
        }
        if (!sibling.isLeaf) {
            for (int i = 1; i <= sibling.keyCount; i++) {
                sibling.child[i - 1] = sibling.child[i];
            }
        }
        child.keyCount++;
        sibling.keyCount--;
    }

    private void merge(Node node, int idx) {
        Node child = node.child[idx];
        Node sibling = node.child[idx + 1];
        int t = (grade + 1) / 2;

        // Poner clave del nodo actual en child
        child.keys[t - 1] = node.keys[idx];
        // Copiar claves de sibling
        for (int i = 0; i < sibling.keyCount; i++) {
            child.keys[i + t] = sibling.keys[i];
        }
        // Copiar hijos de sibling
        if (!child.isLeaf) {
            for (int i = 0; i <= sibling.keyCount; i++) {
                child.child[i + t] = sibling.child[i];
            }
        }
        // Ajustar counts
        child.keyCount += sibling.keyCount + 1;

        // Mover en el padre claves e hijos para tapar el hueco
        for (int i = idx + 1; i < node.keyCount; i++) {
            node.keys[i - 1] = node.keys[i];
            node.child[i] = node.child[i + 1];
        }
        node.keyCount--;
    }

    /**
     * Busca un valor y muestra por pantalla el recorrido:
     * - Cada clave comparada que es menor o igual al valor buscado
     * se imprime seguida de coma.
     * - Cada vez que se desciende de un nodo a uno de sus hijos,
     * se marca con '->'.
     *
     * Ejemplo de salida: 1,5->6,7,8
     *
     * @param value La clave a buscar.
     */
    public void searchWithTrace(int value) {
        StringBuilder trace = new StringBuilder();
        searchTraceRec(root, value, trace);
        // Quitar posible coma final antes de imprimir
        String out = trace.toString();
        if (out.endsWith(",")) {
            out = out.substring(0, out.length() - 1);
        }
        System.out.println(out);

    }

    // Función recursiva auxiliar
    private boolean searchTraceRec(Node node, int value, StringBuilder trace) {
        int i = 0;
        // Recorremos las claves del nodo actual
        while (i < node.keyCount) {
            // Si la clave actual es igual, la mostramos y terminamos
            if (node.keys[i].ID == value) {
                trace.append(node.keys[i]);
                return true;
            }
            // Si la clave es menor, la mostramos y seguimos
            if (value > node.keys[i].ID) {
                trace.append(node.keys[i]).append(",");
                i++;
                continue;
            }
            // Si la clave es mayor, vamos al hijo i
            break;
        }

        // Antes de descender a un hijo, marcamos el cambio de nodo
        trace.append("->");

        // Si es hoja y no encontramos, terminamos
        if (node.isLeaf) {
            return false;
        }
        // Descendemos al hijo correspondiente
        return searchTraceRec(node.child[i], value, trace);
    }

}