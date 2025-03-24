package Tarea10.Programa26;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hecto
 */
public class Operacion {

    public void buscar(int[] vector, int num) {
        int i = 0;
        boolean encontrado = false;

        while (i < vector.length && !encontrado) {
            if (vector[i] == num) {
                encontrado = true;
            }
            i++;
        }
        if (encontrado == true) {
            System.out.println("EL elemento " + num + " se encuentra en la posicion: " + (i - 1));
        } else {
            System.out.println("Elemento no encontrado");
        }

    }

}
