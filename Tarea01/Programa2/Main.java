package Tarea01.Programa2;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Quadrant quadrant = new Quadrant(new double[] { -2d, -3d });

        terminal.print("Programa que determina el cuadrante en el que se ubica un punto(x,y)");
        terminal.print("Equipo 7. Elaborado por");
        terminal.print("Frida Alejandra Mendoza Martinez");
        terminal.print("Gael González Méndez");
        terminal.print("Héctor Desiderio Erasto");

        terminal.print("Uso del constructor: [-2,-3]");

        terminal.showQuadrant(quadrant.getPoint(), quadrant.getQuadrant());

        double[] point = terminal.getPoint();
        quadrant.setPoint(point);
        terminal.showQuadrant(quadrant.getPoint(), quadrant.getQuadrant());

    }
}
