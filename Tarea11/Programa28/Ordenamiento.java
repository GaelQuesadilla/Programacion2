package Tarea11.Programa28;

public class Ordenamiento {

    public void ordena(int vector[]) {
        int i, a, indice;

        for (i = 1; i < vector.length; i++) {
            indice = vector[i];
            a = i - 1;
            while (a >= 0 && (vector[a] > indice)) {
                vector[a + 1] = vector[a];
                a = a - 1;
            }
            vector[a + 1] = indice;
        }
    }
}
