package Tarea04.Programa12;

public abstract class Operacion {

    protected int num1, num2, den1, den2, numR, denR;

    public abstract void calcula();

    public String getResult() {
        return String.format("%s/%s", numR, denR);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getDen1() {
        return den1;
    }

    public void setDen1(int den1) {
        this.den1 = den1;
    }

    public int getDen2() {
        return den2;
    }

    public void setDen2(int den2) {
        this.den2 = den2;
    }

}
