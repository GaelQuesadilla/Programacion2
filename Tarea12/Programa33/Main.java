package Tarea12.Programa33;

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
                "Programa que crea una lista de artículos implementando listas enlazadas (LinkedList) y administra dicha información");

        int option = 0;
        terminal.PrintMenu();
        while (true) {
            option = terminal.requestInt("Ingresa la opción: ");
            terminal.clearLine();

            if (option == 7) {
                break;
            }
            if (option == 1) {
                Article name = terminal.requestArticle();
                list.addFirst(name);

            } else if (option == 2) {
                Article name = terminal.requestArticle();
                list.addLast(name);

            } else if (option == 3) {
                list.removeFirst();

            } else if (option == 4) {
                list.pop();
            } else if (option == 5) {
                String article = terminal.requestString("Ingresa el nombre del articulo a buscar");
                int index = list.searchByName(article);

                if (index == -1) {
                    terminal.Print("El articulo no se encuentra");
                    continue;
                }
                terminal.Print("El articulo se encuentra en la posición " + (index + 1));
            } else if (option == 6) {
                terminal.Print(list.asArray());
            }

        }
        terminal.Print("Saliendo...");
    }
}
