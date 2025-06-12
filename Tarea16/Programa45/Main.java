package Tarea16.Programa45;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Programa 45: Programa que mediante la implementación de las operaciones de un AVL, almacene información de flores.");
        System.out.println("Equipo 7. Elaborado por: Frida, Gael y Héctor.");
        ArbolAVLFlor modelo = new ArbolAVLFlor();
        VistaFlor vista = new VistaFlor();
        ControladorFlor controlador = new ControladorFlor(modelo, vista);
        controlador.iniciar();
    }
}
