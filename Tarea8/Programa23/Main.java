package Tarea8.Programa23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 15;
        Terminal terminal = new Terminal(new Scanner(System.in));
        InsertionSort insertionSort = new InsertionSort();
        double[] sales = new double[total];

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto");

        terminal.Print(
                "Registra las ventas diarias registradas durante 15 días, calcula el promedio de las ventas y muestra la mediana");

        for (int i = 0; i < total; i++) {
            sales[i] = terminal.requestInt("Ingresa las ventas del día " + (i + 1));
        }

        insertionSort.setArray(sales);

        terminal.Print("Ventas sin ordenar");
        terminal.Print(sales);

        insertionSort.sort();
        terminal.Print("Ventas ordenadas");
        terminal.Print(insertionSort.getArray());

        insertionSort.calcAverage();
        terminal.Print("El promedio de las ventas es: " + insertionSort.getAverage());
        terminal.Print("La mediana de las ventas es: " + insertionSort.getArray()[total / 2]); // array[7]

    }
}
