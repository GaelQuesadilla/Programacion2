package Tarea07.Programa21;

public class ModeloEdad {
    public void ordenamientoEdadesRecursivo(int[] vector, boolean band, int n) {
        int aux;
        if (!band) {
            band = true;
            for (int i = 0; i < n - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    band = false;
                }
            }
            ordenamientoEdadesRecursivo(vector, band, n);
        }
    }
}