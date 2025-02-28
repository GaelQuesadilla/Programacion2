package Tarea5.Programa16;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Functions functions = new Functions();

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto");

        terminal.Print("Programa que descompone un número (entero/int) y suma cada uno de sus dígitos");

        int number = terminal.requestInt("Ingresa un número a descomponer");
        functions.setNumber(number);
        functions.calcDigitSum();

        int result = functions.getResult();

        terminal.Print("El resultado es: " + result);

    }
}
