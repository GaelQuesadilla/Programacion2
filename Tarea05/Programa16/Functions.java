package Tarea05.Programa16;

public class Functions {

    private int result, number;

    private int digitSum(int number) {
        if (number == 0) {
            return 0;

        }

        return number % 10 + digitSum(number / 10);
    }

    public void calcDigitSum() {
        this.result = digitSum(number);
    }

    public int getResult() {
        return result;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;

    }

    public Functions(int number) {
        this.number = number;
    }

    public Functions() {
    }

}
