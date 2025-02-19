package Tarea3.Programa9;

public class Triangle extends GeometricFigure {

    private double base, height;

    public void calcPerimeter() {
        // ! Se asume (por temas prácticos) que se habla de un triangulo rectángulo
        double hypotenuse = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.height, 2));
        this.perimeter = this.base + this.height + hypotenuse;
    }

    public void calcArea() {
        this.area = 0.5d * this.base * this.height;
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
