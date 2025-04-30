package Tarea15.Programa42;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        Terminal terminal = new Terminal(scanner);

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto");

        terminal.Print(
                "Programa que crea una árbol binario de búsqueda y administra dicha información");

        int option = 0;
        terminal.PrintMenu();
        while (true) {
            option = terminal.requestInt("Ingresa la opción: ");
            terminal.clearLine();

            if (option == 7) {
                break;
            }
            if (option == 1) {

                int value = terminal.requestInt("Ingresa el número a ingresar");
                tree.insert(value);

            } else if (option == 2) {
                int value = terminal.requestInt("Ingresa el número a eliminar");
                Node nodeToDelete = tree.searchNode(value);
                tree.delete(nodeToDelete);
            } else if (option == 3) {
                int value = terminal.requestInt("Ingresa el número a buscar");
                tree.searchNode(value);

            } else if (option == 4) {
                tree.printOrder();
            } else if (option == 5) {
                tree.printPreOrder();
            } else if (option == 6) {
                tree.printPosOrden();
            }

        }
        terminal.Print("Saliendo...");
    }
}
