package Practicas.Cola.Gael.Programa2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new Queue<Integer>();
        Terminal terminal = new Terminal(scanner);

        terminal.Print("Elaborado por:");
        terminal.Print("Gael González Méndez");

        terminal.Print(
                "Práctica de colas: 1");

        queue.add(10);
        queue.add(20);
        queue.add(30);
        terminal.Print("-------Mostrar final-------");
        terminal.Print(queue.last());
        terminal.Print("-------Mostrar frente-------");
        terminal.Print(queue.front());
        terminal.Print(queue.asArray());

        Integer result = queue.remove();
        terminal.Print("Desencolar " + (result == null ? "Cola vacía" : result));
        result = queue.remove();
        terminal.Print("Desencolar " + (result == null ? "Cola vacía" : result));

        terminal.Print(queue.asArray());

        result = queue.remove();
        terminal.Print("Desencolar " + (result == null ? "Cola vacía" : result));
        terminal.Print(queue.asArray());
        result = queue.remove();
        terminal.Print("Desencolar " + (result == null ? "Cola vacía" : result));
    }
}
