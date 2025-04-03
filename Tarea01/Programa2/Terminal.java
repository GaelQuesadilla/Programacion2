package Tarea01.Programa2;

import java.util.Scanner;

public class Terminal {
    public void print(String message) {
        System.out.println(message);
    }

    public void showQuadrant(double[] point, String quadrant) {
        System.out.printf("El punto [%s,%s] se encuentra en el %s\n", point[0], point[1], quadrant);
    }

    public double[] getPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe las coordenadas del punto");
        System.out.println("X:");
        double x = scanner.nextDouble();
        System.out.println("Y:");
        double y = scanner.nextDouble();

        return new double[] { x, y };

    }
}
