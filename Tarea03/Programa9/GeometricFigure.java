package Tarea03.Programa9;

public class GeometricFigure {
    protected double perimeter, area;
    protected String name;

    public void calcPerimeter(double base, double height) {
        // ! Se asume (por temas prácticos) que se habla de un triangulo rectángulo
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        this.perimeter = base + height + hypotenuse;
    }

    public void calcPerimeter(double side) {

        this.perimeter = side * 4;
    }

    public void calcArea(double base, double height) {
        this.area = 0.5d * base * height;
    }

    public void calcArea(double side) {
        this.area = Math.pow(side, 2);
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
