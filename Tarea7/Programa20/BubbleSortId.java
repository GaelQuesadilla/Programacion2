package Tarea7.Programa20;

public class BubbleSortId {
    private int[] array;

    public void sort() {
        // ? Se ejecuta tantas veces como elementos tenga el vector
        for (int i = 0; i < array.length - 1; i++) {
            // ? Comienza desde la derecha (índice máximo) y desciende (j--)
            // ? Se detiene hasta el número i para optimizar (array[0:i] está ya ordenado)
            for (int j = array.length - 1; j > i; j--) {

                if (array[j - 1] > array[j]) {
                    int aux = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = aux;
                }
            }
        }

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public BubbleSortId() {
    }

    public BubbleSortId(int[] array) {
        this.array = array;
    }

}