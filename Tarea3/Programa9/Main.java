package Tarea3.Programa9;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();

        // Crear un triángulo
        double base = 5, height = 7;
        Triangle triangle = new Triangle("Triángulo", base, height);
        triangle.calcPerimeter();
        triangle.calcArea();

        terminal.Print("Figura: " + triangle.getName());
        terminal.Print("Área: " + triangle.getArea());
        terminal.Print("Perímetro: " + triangle.getPerimeter());

        // Crear un cuadrado
        double side = 4;
        Square square = new Square("Cuadrado", side);
        square.calcPerimeter();
        square.calcArea();

        terminal.Print("\nFigura: " + square.getName());
        terminal.Print("Área: " + square.getArea());
        terminal.Print("Perímetro: " + square.getPerimeter());
    }
}
