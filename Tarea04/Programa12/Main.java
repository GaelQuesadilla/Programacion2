package Tarea04.Programa12;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        int[] fraccion1, fraccion2;
        Operacion operacion = null;
        int opcion;

        terminal.Print(
                "Equipo 7. Elaborado por:\nFrida Alejandra Mendoza Martinez\nGael González Méndez\nHéctor Desiderio Erasto");

        terminal.Print("Suma o multiplicación de fracciones");
        fraccion1 = terminal.requestFraction("Ingresa la primer fracción");
        fraccion2 = terminal.requestFraction("Ingresa la segunda fracción");

        opcion = terminal.requestInt("(1)\tSuma\n(2)\tMultiplicación");

        if (opcion == 1) {
            operacion = new Suma(fraccion1[0], fraccion1[1], fraccion2[0], fraccion2[1]);
        } else if (opcion == 2) {
            operacion = new Multiplicacion(fraccion1[0], fraccion1[1], fraccion2[0], fraccion2[1]);
        }
        operacion.calcula();
        terminal.Print(operacion.getResult());
    }

}
