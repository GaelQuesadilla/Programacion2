package Tarea16.Programa45;

public class Flor {
    int clave;
    String nombre;
    String color;

    public Flor(int clave, String nombre, String color) {
        this.clave = clave;
        this.nombre = nombre;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clave: " + clave + ", Nombre: " + nombre + ", Color: " + color;
    }
}
