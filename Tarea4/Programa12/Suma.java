package Tarea4.Programa12;

public class Suma extends Operacion {

    public void calcula() {
        if (this.den1 == this.den2) {
            this.numR = this.num1 + this.num2;
            this.denR = den1;
            return;
        }

        this.numR = this.num1 * this.den2 + this.num2 * this.den1;
        this.denR = this.num1 * this.num2;

    }

}
