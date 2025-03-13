package Tarea9.Programa25;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        System.out.println("Equipo 07, Programación 2.");
        System.out.println("Elaborado por: Frida, Gael y Héctor.");
        System.out.println(
                "Funcionalidad: Programa que pide las edades de 10 personas, \nmuestra las edades sin ordenar y ordenadas, \ny dice la edad de la persona mayor.");
        System.out.println("-----------------------------------");
        System.out.println("Ingresa las edades de 12 personas:");
        // for (int i = 0; i < 12; i++) {
        // modelo.setEdades(i, vista.pedirEdad(i));
        // }
        int[] ages = new int[] { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        for (int i = 0; i < 12; i++) {
            modelo.setEdades(i, ages[i]);
        }

        System.out.println("\nVector desordenado:");
        vista.mostrarVector(modelo.getEdades());

        modelo.ordenarEdades(0, 11);

        System.out.println("\nVector ordenado:");
        vista.mostrarVector(modelo.getEdades());

        vista.mostrarMayorMenor(modelo.getEdades()[0], modelo.getEdades()[11]);

        vista.cerrarScanner();
    }
}
