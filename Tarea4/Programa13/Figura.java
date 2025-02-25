package Tarea4.Programa13;

public abstract class Figura {
    private double area, perimetro;
    private String nombre;

    public abstract void calculaPerimetro();

    public abstract void calculaArea();

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    protected void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
