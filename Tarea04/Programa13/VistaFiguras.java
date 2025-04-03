package Tarea04.Programa13;

public class VistaFiguras {
    public static void main(String[] args) {
        VistaFiguras pant = new VistaFiguras();
        Controlador controlador = new Controlador();

        pant.escribirM(
                "Elaborado por: Frida Alejandra Mendoza Martínez, Héctor Desiderio Erasto y Gael González Méndez.");
        pant.escribirM("Equipo 07, Programación 2.");
        pant.escribirM(
                "Funcionalidad: Programa que calcula y muestra el área y perímetro de un círculo y un rectángulo.");

        controlador.mostrarDatos();
    }

    public void escribirM(String mensaje) {
        System.out.println(mensaje);
    }
}
