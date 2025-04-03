package Tarea02.Programa5;

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(int codigoEstudiante, float notaFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + "\n Apellido: " + apellido + "\n Edad: " + edad
                + "\n Código de estudiante: " + codigoEstudiante + "\n Nota final: " + notaFinal);
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

}
