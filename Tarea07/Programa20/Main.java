package Tarea07.Programa20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 10;

        Terminal terminal = new Terminal(new Scanner(System.in));
        BubbleSortId bubbleSortId = new BubbleSortId();
        int[] ages = new int[total];

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto");

        terminal.Print(
                "Registra un vector de edades y lo ordena mediante el método de BubbleSort (En su versión ID)");

        for (int i = 0; i < total; i++) {

            ages[i] = terminal.requestInt("Ingresa la edad número " + (i + 1));

        }

        // Debug only
        // ages = new int[] { 15, 23, 28, 29, 49, 10, 12, 20, 21, 8 };

        bubbleSortId.setArray(ages);

        terminal.Print("Vector de edades (sin ordenar)");
        terminal.Print(ages);

        terminal.Print("Vector de edades (ordenado)");
        bubbleSortId.sort();
        terminal.Print(ages);

        terminal.Print(String.format("La persona menor tiene %s años", bubbleSortId.getArray()[0]));

    }

}
