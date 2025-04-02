package Tarea12.Programa30;

import java.util.Scanner;

public class Terminal {
    Scanner scanner;

    public Terminal(Scanner scanner) {
        this.scanner = scanner;
    }

    public String requestString(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        String value = scanner.nextLine();

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
            System.out.printf("%s\t", array[i]);
        }
        System.out.println("");
    }

    public void close() {
        this.scanner.close();
    }

}
