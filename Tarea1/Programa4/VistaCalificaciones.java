package Tarea1.Programa4;

import java.util.Scanner;

public class VistaCalificaciones {
    private Scanner scanner = new Scanner(System.in);

    public void pedirCalificaciones(Calificaciones modelo) {
        System.out.println("Ingrese las 15 calificaciones:");
        for (int i = 0; i < modelo.getCalificaciones().length; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            modelo.setCalificacion(i, scanner.nextDouble());
        }
    }

    public void mostrarResultados(double promedio, double porcentaje) {
        System.out.println("\nPromedio de calificaciones: " + String.format("%.2f", promedio));
        System.out.println(
                "Porcentaje de alumnos con calificación mayor o igual al promedio: "
                        + String.format("%.2f", porcentaje) + "%");
    }
}
