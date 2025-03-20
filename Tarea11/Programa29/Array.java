package Tarea11.Programa29;

public class Array {

    private Day[] array;

    public Array(Day[] array) {
        this.array = array;
    }

    public Array() {
    }

    public void sort() {
        int minIndex;
        Day auxDay;

        for (int i = 0; i < this.array.length; i++) {

            minIndex = i;
            for (int j = i + 1; j < this.array.length; j++) {
                if (this.array[minIndex].getTemperature() > this.array[j].getTemperature()) {
                    minIndex = j;
                }
            }
            auxDay = this.array[i];
            this.array[i] = this.array[minIndex];
            this.array[minIndex] = auxDay;

        }

    }

    public int binarySearch(int target) {
        boolean founded = false;
        int center = 0;
        int lower = 0;
        int upper = array.length - 1;

        while (lower <= upper && !founded) {
            center = (upper + lower) / 2;
            if (array[center].getTemperature() == target) {
                founded = true;
            } else if (array[center].getTemperature() < target) {
                lower = center + 1;
            } else {
                upper = center - 1;
            }
        }

        if (!founded) {
            return -1;
        }

        return center;
    }

    public Day[] getArray() {
        return array;
    }

    public void setArray(Day[] array) {
        this.array = array;
    }
}
