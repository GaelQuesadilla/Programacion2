package Practicas.LinkedList.Gael.Programa1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        Terminal terminal = new Terminal(new Scanner(System.in));

        terminal.Print("Programa 1. Elaborado por Gael González Méndez");
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);
        list.insert(25, 2);

        terminal.Print("Lista después de inserciones: inicio 10, 20, 30; final: 40; entre 25 pos 2");

        terminal.Print(list.asArray());

    }

}
