/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea6.Programa17;

import java.util.Scanner;

/**
 *
 * @author Hecto
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(
                "Equipo 7 \nElaborado por: \nHector Desiderio Erasto \nGael Gonzalez Mendez \nFrida Alejandra Mendoza Martinez");
        System.out.println("Programa 17");
        System.out.println("Ordenamiento de seleccion");

        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        Seleccion seleccion = new Seleccion();

        System.out.println("\nIngresa 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        System.out.println("\nVector ingresado:");
        mostrarArray(vector);

        seleccion.ordena(vector, vector.length);

        System.out.println("\nVector ordenado:");
        mostrarArray(vector);

    }

    public static void mostrarArray(int[] vector) {
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
