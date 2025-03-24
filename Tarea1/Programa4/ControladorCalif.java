package Tarea1.Programa4;

public class ControladorCalif {
    private Calificaciones modelo;
    private VistaCalificaciones vista;

    public ControladorCalif(Calificaciones modelo, VistaCalificaciones vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {

        System.out.println("Programa que pide dos numeros, calcula la suma, resta, multiplicación y división");
        System.out.println("Equipo 7. Elaborado por:");
        System.out.println("Frida Alejandra Mendoza Martinez");
        System.out.println("González Méndez Gael");
        System.out.println("Héctor Desiderio Erasto");
        vista.pedirCalificaciones(modelo);
        double promedio = modelo.calcularPromedio();
        double porcentaje = modelo.calcularPorcentajeAprobados();
        vista.mostrarResultados(promedio, porcentaje);
    }

    public static void main(String[] args) {
        Calificaciones modelo = new Calificaciones();
        VistaCalificaciones vista = new VistaCalificaciones();
        ControladorCalif controlador = new ControladorCalif(modelo, vista);

        controlador.ejecutar();
    }
}