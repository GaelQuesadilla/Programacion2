package Practicas.Pila.Gael.Programa1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Terminal terminal = new Terminal(scanner);
        Stack stack = new Stack();

        terminal.Print("Programa 1. Elaborado por Gael González Méndez");
        terminal.Print("Práctica de pilas");

        terminal.Print("----------Prueba push           ----------");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        terminal.Print(stack.asArray());

        terminal.Print("----------Prueba mostrar tope   ----------");
        terminal.Print(stack.top());

        terminal.Print("----------Prueba pop            ----------");
        stack.pop();
        terminal.Print(stack.asArray());

        terminal.Print("----------Prueba vaciar pila    ----------");
        stack.pop();
        stack.pop();
        stack.pop();
        terminal.Print(stack.asArray());

    }
}
