package Tarea12.Programa30;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        Terminal terminal = new Terminal(new Scanner(System.in));

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto");

        terminal.Print(
                "Programa que crea una lista de alumnos (nombre) implementando listas enlazadas (nodo) y administra dicha información");

        int option = 0;
        terminal.PrintMenu();
        while (true) {
            option = terminal.requestInt("Ingresa la opción: ");
            terminal.clearLine();

            if (option == 7) {
                break;
            }
            if (option == 1) {
                String name = terminal.requestString("Ingresa el nombre");
                list.addFirst(name);

            } else if (option == 2) {
                String name = terminal.requestString("Ingresa el nombre");
                list.addLast(name);

            } else if (option == 3) {
                list.removeFirst();

            } else if (option == 4) {
                list.pop();
            } else if (option == 5) {
                String name = terminal.requestString("Ingresa el nombre a buscar");
                int index = list.search(name);

                if (index == -1) {
                    terminal.Print("El estudiante no se encuentra");
                    continue;
                }
                terminal.Print("El estudiante se encuentra en la posición " + (index + 1));
            } else if (option == 6) {
                terminal.Print(list.asArray());
            }

        }
        terminal.Print("Saliendo...");
    }
}
