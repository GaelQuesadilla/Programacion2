package Tarea09.Programa24;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hecto
 */

public class Operaciones {

    public void ordena(int[] vector, int izq, int der) {
        int pivote, aux;
        int i = izq;
        int j = der;

        pivote = vector[izq];

        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
            }
        }

        vector[izq] = vector[j];
        vector[j] = pivote;

        if (izq < j - 1) {
            ordena(vector, izq, j - 1);
        }
        if (j + 1 < der) {
            ordena(vector, j + 1, der);
        }
    }

}
