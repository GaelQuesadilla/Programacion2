package Tarea3.Programa9;

public class GeometricFigure {
    protected double perimeter, area;
    protected String name;

    public void calcPerimeter() {
        return;
    }

    public void calcArea() {
        return;
    }

    public GeometricFigure() {
    }

    public GeometricFigure(double perimeter, double area, String name) {
        this.perimeter = perimeter;
        this.area = area;
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
