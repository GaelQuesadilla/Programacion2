package Tarea16.Programa45;

public class ControladorFlor {
    private ArbolAVLFlor modelo;
    private VistaFlor vista;

    public ControladorFlor(ArbolAVLFlor modelo, VistaFlor vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    Flor nueva = vista.pedirDatosFlor();
                    modelo.insertar(nueva);
                    vista.mostrarMensaje("Flor insertada.");
                    break;
                case 2:
                    vista.mostrarMensaje("Eliminar no implementado.");
                    break;
                case 3:
                    int clave = vista.pedirClave();
                    Flor encontrada = modelo.buscar(clave);
                    if (encontrada != null)
                        vista.mostrarFlor(encontrada);
                    else
                        vista.mostrarMensaje("Flor no encontrada.");
                    break;
                case 4:
                    vista.mostrarMensaje("Flores en orden:");
                    modelo.mostrar();
                    break;
                case 5:
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
