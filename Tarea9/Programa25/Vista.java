package Tarea9.Programa25;

import java.util.Scanner;

public class Vista {
    private Scanner hyuka = new Scanner(System.in);

    public void mostrarVector(int[] vector) {
        for (int i = 0; i < 12; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public int pedirEdad(int index) {
        System.out.print("Edad " + (index + 1) + ": ");
        return hyuka.nextInt();
    }

    public void mostrarMayorMenor(int menor, int mayor) {
        System.out.println("\nMenor edad: " + menor);
        System.out.println("Mayor edad: " + mayor);
    }

    public void cerrarScanner() {
        hyuka.close();
    }

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.ejecutar();
    }
}
