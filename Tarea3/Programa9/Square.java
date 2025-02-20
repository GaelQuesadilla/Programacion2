package Tarea3.Programa9;

public class Square extends GeometricFigure {

    private double side;

    public Square(String name, double side) {
        this.side = side;
        this.name = name;
    }

    public void calcPerimeter() {
        this.calcPerimeter(side);
    }

    public void calcArea() {
        this.calcArea(this.side);
    }

    public Square(double perimeter, double area, String name) {
        super(perimeter, area, name);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}
