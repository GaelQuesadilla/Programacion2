package Tarea1.Programa1;

public class Main {

    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Operation operation = new Operation();

        double firstNumber = terminal.getNumber();
        final double secondNumber = terminal.getNumber();

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
