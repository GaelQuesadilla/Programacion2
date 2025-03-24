package Tarea1.Programa1;

public class Main {

    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Operation operation = new Operation();

        double firstNumber = terminal.getNumber();
        final double secondNumber = terminal.getNumber();

        terminal.Print("Programa que pide dos numeros, calcula la suma, resta, multiplicación y división");
        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("González Méndez Gael");
        terminal.Print("Héctor Desiderio Erasto");

        operation.setNumber1(firstNumber);
        operation.setNumber2(secondNumber);
        operation.calcSum();
        operation.calcSubtract();
        operation.calcMultiply();
        operation.calcDivide();

        terminal.PrintResult("Suma", operation.getSum());
        terminal.PrintResult("Resta", operation.getSubtract());
        terminal.PrintResult("Multiplicación", operation.getMultiply());
        terminal.PrintResult("División", operation.getDivide());
    }
}
