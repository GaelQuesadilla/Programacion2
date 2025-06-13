package Tarea17.Programa46;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MTree mTree = new MTree(4);
        Terminal terminal = new Terminal(scanner);

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto");

        terminal.Print(
                "Programa que crea un árbol multi-camino de números enteros");

        int option = 0;
        terminal.PrintMenu();
        while (true) {
            option = terminal.requestInt("Ingresa la opción: ");

            if (option == 5) {
                break;
            }
            if (option == 1) {
                int number = terminal.requestInt("Ingrese el número a añadir");
                mTree.insert(number);

            } else if (option == 2) {
                int number = terminal.requestInt("Ingrese el número a eliminar");
                mTree.delete(number);

            } else if (option == 3) {
                int number = terminal.requestInt("Ingrese el número a buscar");
                mTree.searchWithTrace(number);
            } else if (option == 4) {
                mTree.Show();

            }
        }
        terminal.Print("Saliendo...");
    }

}
