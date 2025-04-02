package Tarea5.Programa15;

import java.util.Scanner;

public class VistaSuma {
    private Scanner scanner;

    public VistaSuma() {
        this.scanner = new Scanner(System.in);
    }

    public void escribirM(String mensaje) {
        System.out.println(mensaje);
    }

    public int pedirEntero(String mensaje) {
        escribirM(mensaje);
        return scanner.nextInt();
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
