package Tarea08.Programa23;

public class InsertionSort {

    private double[] array;
    private double average;

    public void sort() {
        double index;
        for (int i = 1; i < array.length; i++) {
            index = array[i];
            int a = i - 1;
            while (a >= 0 && array[a] > index) {
                array[a + 1] = array[a];
                a = a - 1;
            }
            array[a + 1] = index;
        }
    }

    public void calcAverage() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }

    public InsertionSort(double[] array) {
        this.array = array;
    }

    public InsertionSort() {
    }

    public double getAverage() {
        return average;
    }

}
