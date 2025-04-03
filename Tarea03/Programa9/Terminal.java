package Tarea03.Programa9;

import java.util.Scanner;

public class Terminal {

    public String requestString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String value = scanner.nextLine();
        return value;
    }

    public double requestDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        double value = scanner.nextDouble();
        return value;
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
