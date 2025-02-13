package Tarea1.Programa1;

import java.util.Scanner;

public class Terminal {

    public Terminal() {
        this.Print("Programa 1: Elaborado por Gael González Méndez");
    }

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
        System.out.printf("El resultado de %s es %s\n", valueName, value);
    }

}
