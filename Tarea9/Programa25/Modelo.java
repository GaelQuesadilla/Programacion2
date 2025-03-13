package Tarea9.Programa25;

public class Modelo {
    private int[] edades = new int[12];

    public int[] getEdades() {
        return edades;
    }

    public void setEdades(int index, int edad) {
        if (index >= 0 && index < 12) {
            edades[index] = edad;
        }
    }

    public void ordenarEdades(int izq, int der) {
        if (izq >= der) {
            return;
        }

        int pivote = edades[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (edades[i] <= pivote && i < j) {
                i++;
            }
            while (edades[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = edades[i];
                edades[i] = edades[j];
                edades[j] = aux;
            }
        }

        edades[izq] = edades[j];
        edades[j] = pivote;

        ordenarEdades(izq, j - 1);
        ordenarEdades(j + 1, der);
    }
}
