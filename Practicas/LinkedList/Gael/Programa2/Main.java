package Practicas.LinkedList.Gael.Programa2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        Terminal terminal = new Terminal(new Scanner(System.in));

        terminal.Print("Programa 1. Elaborado por Gael González Méndez");
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.insert(25, 2);
        terminal.Print("Lista después de inserciones");
        terminal.Print(list.asArray());

        list.removeFirst();
        list.pop();
        list.remove(0); // ? Position 1, index 0
        terminal.Print("Lista después de las eliminaciones");
        terminal.Print(list.asArray());
    }

}
