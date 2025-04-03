package Tarea02.Programa5;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Programa que registra y muestra los datos de un estudiante");
        System.out.println("Equipo 7. Elaborado por:");
        System.out.println("Frida Alejandra Mendoza Martinez");
        System.out.println("González Méndez Gael");
        System.out.println("Héctor Desiderio Erasto");

        Estudiante est1 = new Estudiante(2421064, 10, "Frida", "Alejandra", 18);
        est1.mostrarDatos();
    }

}
