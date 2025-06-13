package Tarea17.Programa47;

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

    public int requestInt(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        int value = scanner.nextInt();

        return value;
    }

    public Furniture requessFurniture(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        System.out.printf("\u001B[33m%s\u001B[0m\n", "Escribe el nombre del pueble");
        String name = scanner.nextLine();
        clearLine();
        System.out.printf("\u001B[33m%s\u001B[0m\n", "Escribe el precio del pueble");
        Double price = scanner.nextDouble();
        System.out.printf("\u001B[33m%s\u001B[0m\n", "Escribe el ID del mueble");
        int ID = scanner.nextInt();

        return new Furniture(name, price, ID);

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
        System.out.println("|\t1\t|\tAñadir\t\t\t|");
        System.out.println("|\t2\t|\tEliminar\t\t|");
        System.out.println("|\t3\t|\tBuscar\t\t\t|");
        System.out.println("|\t4\t|\tMostrar orden\t\t|");
        System.out.println("|\t5\t|\tSalir\t\t\t|");
    }

    public void close() {
        this.scanner.close();
    }

}
