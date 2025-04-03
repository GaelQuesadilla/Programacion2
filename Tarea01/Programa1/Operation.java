package Tarea01.Programa1;

public class Operation {

    private double number1, number2, sum, subtract, multiply, divide;

    public Operation() {
    }

    public Operation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double getSum() {
        return sum;
    }

    public double getSubtract() {
        return subtract;
    }

    public double getMultiply() {
        return multiply;
    }

    public double getDivide() {
        return divide;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void calcSum() {
        this.sum = number1 + number2;
    }

    public void calcSubtract() {
        this.subtract = number1 - number2;
    }

    public void calcMultiply() {
        this.multiply = (double) number1 * number2;
    }

    public void calcDivide() {
        this.divide = (double) number1 / number2;
    }

}