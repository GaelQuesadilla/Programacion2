/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea7.Programa19;

/**
 *
 * @author Hecto
 */
public class Ordenamiento {

    public void ordena(int vector[], int n) {
        int temp, j, i;
        for (i = 0; i < n - 1; i = i + 1) {
            for (j = 0; j < n - i - 1; j = j + 1) {
                if (vector[j] > vector[j + 1]) {
                    temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }

}
