package Tarea03.Programa8;

public class VistaAnimal extends ControladorAnimal {
    public static void main(String[] args) {
        VistaAnimal pant = new VistaAnimal();
        {

            pant.escribirM(
                    "Elaborado por: Frida Alejandra Mendoza Martínez \n Gael González Méndez\nHéctor Desiderio Erasto.\nEquipo 07, Programación 2.");
            pant.escribirM(
                    "Funcionalidad: Programa que crea una clase animal con el método comer, \n y tres clases hijas (Persona, Perro y Vaca); las clases Perro y Persona sobre escriben el método comer especificando la manera de comer.");
            pant.mostrarDatos();
        }
    }
}
