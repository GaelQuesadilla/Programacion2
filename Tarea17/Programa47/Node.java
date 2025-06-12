package Tarea17.Programa47;

public class Node {

    int keyCount;
    int keys[];
    Node child[];
    boolean isLeaf = true;

    /**
     * 
     * @param grade max number of elements
     */
    public Node(int grade) {
        this.keys = new int[grade - 1];
        this.child = new Node[grade];
    }

    /**
     * 
     * @param value value to search
     * @return the index of the searched element, -1 if doesn't exist
     */
    public int Find(int value) {
        for (int i = 0; i < this.keyCount; i++) {
            if (this.keys[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
