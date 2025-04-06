package Tarea12.Programa33;

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

    public Double requestDouble(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        Double value = scanner.nextDouble();

        return value;
    }

    public int requestInt(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        int value = scanner.nextInt();

        return value;
    }

    public Article requestArticle() {
        String name = this.requestString("Ingresa el nombre del artículo");
        int code = this.requestInt("Ingresa el código del artículo");
        int quantity = this.requestInt("Ingresa la cantidad de artículos");
        double price = this.requestDouble("Ingresa el precio del artículo");
        return new Article(price, code, quantity, name);
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
        System.out.println("|\t1\t|\tInserta al inicio\t|");
        System.out.println("|\t2\t|\tInserta al final\t|");
        System.out.println("|\t3\t|\tElimina al inicio\t|");
        System.out.println("|\t4\t|\tElimina al final\t|");
        System.out.println("|\t5\t|\tBuscar\t\t\t|");
        System.out.println("|\t6\t|\tMostrar\t\t\t|");
        System.out.println("|\t7\t|\tSalir\t\t\t|");
    }

    public void close() {
        this.scanner.close();
    }

}
