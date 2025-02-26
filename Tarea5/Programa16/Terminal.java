package Tarea5.Programa16;

import java.util.Scanner;

public class Terminal {
    public int requestInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int value = scanner.nextInt();

        scanner.close();
        return value;
    }

    public void Print(String message) {
        System.out.println(message);
    }

}
