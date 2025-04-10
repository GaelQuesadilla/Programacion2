package Tarea14.Programa38;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new Queue<String>();
        Terminal terminal = new Terminal(scanner);

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto");

        terminal.Print(
                "Programa que crea una cola de nombres de personas y administra dicha información");

        int option = 0;
        terminal.PrintMenu();
        while (true) {
            option = terminal.requestInt("Ingresa la opción: ");
            terminal.clearLine();

            if (option == 6) {
                break;
            }
            if (option == 1) {
                String name = terminal.requestString("Ingresa el nombre");
                queue.add(name);

            } else if (option == 2) {
                terminal.Print("Desencolar: " + queue.remove());

            } else if (option == 3) {
                terminal.Print("Frente: " + queue.front());

            } else if (option == 4) {
                terminal.Print("Final: " + queue.last());
            } else if (option == 5) {
                terminal.Print(queue.asArray());
            }

        }
        terminal.Print("Saliendo...");
    }
}
