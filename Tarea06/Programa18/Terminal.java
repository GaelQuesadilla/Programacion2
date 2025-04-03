package Tarea06.Programa18;

import java.util.Scanner;

public class Terminal {
    public int requestInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        int value = scanner.nextInt();

        return value;
    }

    public String requestString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        String value = scanner.nextLine();

        return value;
    }

    public void Print(String message) {
        System.out.println(message);
    }

    public void Print(String[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s\t", array[i]);
        }
        System.err.println("");
    }

    public void Print(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s\t", array[i]);
        }
        System.err.println("");
    }

}
