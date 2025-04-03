package Tarea02.Programa6;

import java.util.Scanner;

public class Terminal {

    public int getInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int value = scanner.nextInt();
        return value;
    }

    public double getDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        double value = scanner.nextDouble();
        return value;
    }

    public String getString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String value = scanner.nextLine();
        return value;
    }

    public void Print(String message) {
        System.out.println(message);
    }

}
