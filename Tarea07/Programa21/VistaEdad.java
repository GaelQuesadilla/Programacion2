package Tarea07.Programa21;

import java.util.Scanner;

public class VistaEdad {
    private Scanner scanner;

    public VistaEdad() {
        scanner = new Scanner(System.in);
    }

    public int[] obtenerValoresVector() {
        int[] vector = new int[10];
        System.out.println("Ingresa las edades de las personas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    public static void main(String[] args) {
        ModeloEdad modelo = new ModeloEdad();
        VistaEdad vista = new VistaEdad();
        ControladorEdad controlador = new ControladorEdad(modelo, vista);

        System.out.println("Equipo 07, Programación 2.");
        System.out.println("Elaborado por: Frida, Gael y Héctor.");
        System.out.println("Funcionalidad: Programa que pide las edades de 12 personas, " +
                "muestra las edades sin ordenar y ordenadas, y dice la edad de la persona mayor.");

        controlador.ejecutar();
    }
}