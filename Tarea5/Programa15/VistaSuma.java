package Tarea5.Programa15;

public class VistaSuma {
    public static void main(String[] args) {
        VistaSuma pant = new VistaSuma();

        pant.escribirM(
                "Elaborado por: Frida Alejandra Mendoza Martínez, \nGael González Méndez y Héctor Desiderio Erasto.");
        pant.escribirM("Equipo 07, Programación 2.");
        pant.escribirM(
                "Funcionalidad: Programa que calcula y muestra la multiplicación de dos números usando sumas sucesivas.");
    }

    public void escribirM(String mensaje) {
        System.out.println(mensaje);
    }
}
