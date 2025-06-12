package Tarea16.Programa45;

import java.util.Scanner;

public class VistaFlor {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- Menú AVL de Flores ---");
        System.out.println("1. Insertar");
        System.out.println("2. Eliminar (no implementado)");
        System.out.println("3. Buscar");
        System.out.println("4. Mostrar orden");
        System.out.println("5. Salir");
        System.out.print("Opción: ");
        return scanner.nextInt();
    }

    public Flor pedirDatosFlor() {
        System.out.print("Clave: ");
        int clave = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        return new Flor(clave, nombre, color);
    }

    public int pedirClave() {
        System.out.print("Ingrese la clave a buscar: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarFlor(Flor flor) {
        System.out.println(flor);
    }
}
