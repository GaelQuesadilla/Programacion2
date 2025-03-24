package Tarea11.Programa28;

import java.util.*;

public class Vista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ordenamiento ordenamiento = new Ordenamiento();
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();

        System.out.println("Equipo 07, Programación 2.");
        System.out.println("Elaborado por: Frida, Gael y Héctor.");
        System.out.println(
                "Funcionalidad: Programa que pide 10 números y busca un número dado por el usuario \ncon método búsqueda binaria");

        int[] vector = new int[10];
        System.out.println("Ingresa 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        ordenamiento.ordena(vector);

        System.out.println("Array ordenado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        System.out.print("\nIngresa el número a buscar: ");
        int num = scanner.nextInt();

        int resultado = busquedaBinaria.BusquedaBin(vector, num);
        if (resultado != -1) {
            System.out.println("El elemento " + num + " se encuentra en la posición " + (resultado + 1));
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}