package Tarea4.Programa12;

public class Multiplicacion extends Operacion {

    public void calcula() {
        this.numR = this.num1 * this.num2;
        this.denR = this.den1 * this.den2;
    }

    public Multiplicacion(int num1, int den1, int num2, int den2) {
        this.num1 = num1;
        this.num2 = num2;
        this.den1 = den1;
        this.den2 = den2;
    }

}
