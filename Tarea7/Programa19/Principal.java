/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea7.Programa19;

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
        System.out.println("Programa 19");
        System.out.println("Registra 10 edades y las ordena con el metodo de Burbuja\n");

        Scanner vista = new Scanner(System.in);
        int[] vector = new int[10];
        Ordenamiento orde = new Ordenamiento();

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");

            vector[i] = vista.nextInt();
        }

        System.out.println("\nEdades sin ordenar:");
        mostrarArray(vector);

        orde.ordena(vector, vector.length);

        System.out.println("\nEdades ordenadas:");
        mostrarArray(vector);

    }

    public static void mostrarArray(int[] vector) {
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
