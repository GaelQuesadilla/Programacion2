package Tarea13.Programa35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Terminal terminal = new Terminal(scanner);
        Stack stack = new Stack();

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto");

        terminal.Print(
                "Crea una pila:Stack  de clases perro:Dog y administra dicha información");

        terminal.PrintMenu();
        int option = 0;
        while (true) {

            option = terminal.requestInt("Ingresa la opción:");
            terminal.clearLine();

            if (option == 5) {
                break;
            }

            if (option == 1) {
                Dog dog = terminal.requestDog();
                stack.push(dog);
            } else if (option == 2) {
                stack.pop();
            } else if (option == 3) {
                terminal.Print(stack.top());
            } else if (option == 4) {
                terminal.Print(stack.asArray());

            }
        }
        terminal.Print("Saliendo...");
    }
}
