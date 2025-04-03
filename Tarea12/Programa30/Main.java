package Tarea12.Programa30;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        Terminal terminal = new Terminal(new Scanner(System.in));

        terminal.Print("Constructor vacío");
        terminal.Print(list.asArray());

        terminal.Print("Insertar al final 1");
        list.addLast("1");
        terminal.Print(list.asArray());

        terminal.Print("Insertar al final 2");
        list.addLast("2");
        terminal.Print(list.asArray());

        terminal.Print("Insertar al final 3");
        list.addLast("3");
        terminal.Print(list.asArray());

        terminal.Print("Insertar al inicio 0");
        list.addFirst("0");
        terminal.Print(list.asArray());

        terminal.Print("Insertar al inicio -1");
        list.addFirst("-1");
        terminal.Print(list.asArray());

        terminal.Print("Insertar al inicio -2");
        list.addFirst("-2");
        terminal.Print(list.asArray());

        terminal.Print("Remover el último");
        list.pop();
        terminal.Print(list.asArray());
        terminal.Print("Remover el último");
        list.pop();
        terminal.Print(list.asArray());

        terminal.Print("Remover el primero");
        list.removeFirst();
        terminal.Print(list.asArray());

        terminal.Print("Remover el primero");
        list.removeFirst();
        terminal.Print(list.asArray());

        terminal.Print("Tamaño: " + list.size());

        terminal.Print("Insertar al final 2");
        list.addLast("2");
        terminal.Print(list.asArray());

        terminal.Print("Buscar 0");
        terminal.Print(list.search("0"));

        terminal.Print("Buscar 2");
        terminal.Print(list.search("2"));

        terminal.Print("Buscar 100");
        terminal.Print(list.search("100"));

    }

}
