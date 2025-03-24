package Tarea8.Programa23;

import java.util.Scanner;

public class Terminal {
    Scanner scanner;

    public Terminal(Scanner scanner) {
        this.scanner = scanner;
    }

    public int requestInt(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        int value = scanner.nextInt();

        return value;
    }

    public double requestDouble(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        double value = scanner.nextDouble();

        return value;
    }

    public void Print(String message) {
        System.out.println(message);
    }

    public void Print(double[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s\t", String.format("%.2f", array[i]));
        }
        System.err.println("");
    }

    public void close() {
        this.scanner.close();
    }

}
