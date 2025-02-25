package Tarea1.Programa4;

public class ControladorCalif {
    private Calificaciones modelo;
    private VistaCalificaciones vista;

    public ControladorCalif(Calificaciones modelo, VistaCalificaciones vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
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