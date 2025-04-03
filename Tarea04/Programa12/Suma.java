package Tarea04.Programa12;

public class Suma extends Operacion {

    public void calcula() {
        if (this.den1 == this.den2) {
            this.numR = this.num1 + this.num2;
            this.denR = den1;
            return;
        }

        this.numR = this.num1 * this.den2 + this.num2 * this.den1;
        this.denR = this.den1 * den2;

    }

    public Suma(int num1, int den1, int num2, int den2) {
        this.num1 = num1;
        this.num2 = num2;
        this.den1 = den1;
        this.den2 = den2;
    }

}
