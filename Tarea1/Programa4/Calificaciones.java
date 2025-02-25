package Tarea1.Programa4;

public class Calificaciones {
    private double[] calificaciones = new double[15];

    public void setCalificacion(int f, double valor) {
        if (f >= 0 && f < calificaciones.length) {
            calificaciones[f] = valor;
        }
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : calificaciones) {
            suma += nota;
        }
        return suma / calificaciones.length;
    }

    public double calcularPorcentajeAprobados() {
        double promedio = calcularPromedio();
        int contador = 0;
        for (double nota : calificaciones) {
            if (nota >= promedio) {
                contador++;
            }
        }
        return (contador * 100.0) / calificaciones.length;
    }
}
