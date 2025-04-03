package Tarea08.Programa22;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hecto
 */
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
