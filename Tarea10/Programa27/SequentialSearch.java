package Tarea10.Programa27;

public class SequentialSearch {
    private int[] array;

    public void search(int number) {
        boolean found = false;
        int i = 0;

        while (i < array.length && !found) {
            if (array[i] == number) {
                found = true;
            }
            i++;
        }
        if (!found) {
            System.out.println("Elemento no encontrado");
            return;
        }
        System.out.printf("El elemento %s se encuentra en la posición %s\n", number, i);

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public SequentialSearch() {
    }

    public SequentialSearch(int[] array) {
        this.array = array;
    }

}
