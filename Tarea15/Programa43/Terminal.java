package Tarea15.Programa43;

import java.util.Scanner;

public class Terminal {
    Scanner scanner;

    public Terminal(Scanner scanner) {
        this.scanner = scanner;
    }

    public void clearLine() {
        scanner.nextLine();
    }

    public String requestString(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        String value = scanner.nextLine();

        return value;
    }

    public Product requestProduct(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        int id = requestInt("Ingresa el ID del producto");
        clearLine();
        String name = requestString("Ingresa el nombre del producto");
        int amount = requestInt("Ingresa la cantidad de productos");

        Product value = new Product(name, id, amount);
        return value;
    }

    public int requestInt(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        int value = scanner.nextInt();

        return value;
    }

    public void Print(String message) {
        System.out.println(message);
    }

    public void Print(int message) {
        System.out.println(message);
    }

    public void Print(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s -> ", array[i]);
        }
        System.out.println("null");
    }

    public void PrintMenu() {
        System.out.println("\t\tMenu");

        System.out.println("\u001B[35m|\tOpcion\t|\tAcción\t\t\t|\u001B[0m");
        System.out.println("|\t1\t|\tInsertar\t\t|");
        System.out.println("|\t2\t|\tEliminar\t\t|");
        System.out.println("|\t3\t|\tBuscar\t\t\t|");
        System.out.println("|\t4\t|\tMostrar orden\t\t|");
        System.out.println("|\t5\t|\tMostrar pre-orden\t|");
        System.out.println("|\t6\t|\tMostrar pos-orden\t|");
        System.out.println("|\t7\t|\tSalir\t\t\t|");
    }

    public void close() {
        this.scanner.close();
    }

}
