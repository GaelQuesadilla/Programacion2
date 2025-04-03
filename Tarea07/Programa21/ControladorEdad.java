package Tarea07.Programa21;

public class ControladorEdad {
    private ModeloEdad modelo;
    private VistaEdad vista;

    public ControladorEdad(ModeloEdad modelo, VistaEdad vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        int[] edades = vista.obtenerValoresVector();

        System.out.println("\nEdades sin ordenar:");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }

        modelo.ordenamientoEdadesRecursivo(edades, false, edades.length);

        System.out.println("\n\nEdades ordenadas:");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }

        int edadMayor = edades[edades.length - 1];
        System.out.println("\n\nLa edad mayor es: " + edadMayor);
    }
}