package Tarea4.Programa11;

public class VistaSeres {
    public static void main(String[] args) {
        VistaSeres pant = new VistaSeres();
        ControladorSeres controlador = new ControladorSeres();

        pant.escribirM("Elaborado por: Frida Alejandra Mendoza Martínez y Gael González Méndez.");
        pant.escribirM("Equipo 07, Programación 2.");
        pant.escribirM(
                "Funcionalidad: Programa que muestra cómo se alimentan los seres vivos usando clases abstractas.");

        controlador.mostrarDatos();
    }

    public void escribirM(String mensaje) {
        System.out.println(mensaje);
    }
}
