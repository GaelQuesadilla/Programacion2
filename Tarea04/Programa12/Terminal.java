package Tarea04.Programa12;

import java.util.Scanner;

public class Terminal {
    public int[] requestFraction(String message) {
        Scanner scanner = new Scanner(System.in);
        int[] fraction = new int[2];

        System.out.println(message);

        fraction[0] = scanner.nextInt();
        System.out.println("\u001B[33m/\u001B[0m");
        fraction[1] = scanner.nextInt();

        return fraction;
    }

    public int requestInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int value = scanner.nextInt();
        return value;
    }

    public void Print(String message) {
        System.out.println(message);
    }

}
