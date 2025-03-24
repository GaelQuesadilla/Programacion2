package Tarea11.Programa28;

public class BusquedaBinaria {

    public int BusquedaBin(int[] vector, int num) {
        int inf = 0;
        int sup = vector.length - 1;

        while (inf <= sup) {
            int centro = (inf + sup) / 2;
            if (vector[centro] == num) {
                return centro;
            } else if (vector[centro] < num) {
                inf = centro + 1;
            } else {
                sup = centro - 1;
            }
        }
        return -1;
    }
}