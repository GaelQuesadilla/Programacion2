package Tarea3.Programa9;

public class Triangle extends GeometricFigure {

    private double base, height;

    public void calcPerimeter() {
        this.calcPerimeter(base, height);
    }

    public void calcArea() {
        this.calcArea(base, height);
    }

    public Triangle(double perimeter, double area, String name, double base, double height) {
        super(perimeter, area, name);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
