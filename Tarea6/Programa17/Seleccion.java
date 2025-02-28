/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea6.Programa17;

/**
 *
 * @author Hecto
 */
public class Seleccion {

    public void ordena(int vector[], int n) {

        int i, j, min, aux;

        for (i = 0; i < n; i = i + 1) {
            min = i;
            for (j = i + 1; j < n; j = j + 1) {
                if (vector[j] < vector[min]) {
                    min = j;
                }
            }
            aux = vector[i];
            vector[i] = vector[min];
            vector[min] = aux;

        }

    }
}
