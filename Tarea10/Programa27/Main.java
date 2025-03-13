package Tarea10.Programa27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal(new Scanner(System.in));
        SequentialSearch sequentialSearch = new SequentialSearch();
        int total = 10;

        int products[] = new int[total];

        int option = 1;

        while (true) {
            if (option == 2) {
                break;
            }
            terminal.Print("Ingresa las cantidades de los productos ");
            for (int i = 0; i < products.length; i++) {
                products[i] = terminal.requestInt("Ingresa el producto n. " + (i + 1));
            }

            int numberToSearch = terminal.requestInt("Ingresa el numero a buscar");

            sequentialSearch.setArray(products);
            sequentialSearch.search(numberToSearch);
            option = terminal.requestInt("Continuar?...\t(1:Si\t2:No)");

        }
    }
}
