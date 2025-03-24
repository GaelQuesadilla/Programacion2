package Tarea1.Programa1;

import java.util.Scanner;

public class Terminal {

    public double getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");
        double value = scanner.nextDouble();
        return value;
    }

    public void Print(String message) {
        System.out.println(message);
    }

    public void PrintResult(String valueName, double value) {
        System.out.printf("El resultado de %s es %s\n", valueName, String.format("%.2f", value));
    }

}
