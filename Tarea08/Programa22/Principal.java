package Tarea08.Programa22;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        System.out.println("Programa 22");
        System.out.println("Pedir 10 numeros y ordenarlos con el metodo de insercion\n");

        Scanner vista = new Scanner(System.in);
        int[] vector = new int[10];
        Ordenamiento model = new Ordenamiento();

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");

            vector[i] = vista.nextInt();
        }

        System.out.println("\nNumeros sin ordenar:");
        mostrarArray(vector);

        model.ordena(vector);

        System.out.println("\nNumeros ordenados:");
        mostrarArray(vector);

    }

    public static void mostrarArray(int[] vector) {
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
