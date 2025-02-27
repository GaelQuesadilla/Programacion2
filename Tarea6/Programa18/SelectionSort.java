package Tarea6.Programa18;

public class SelectionSort {
    private int[] patients;
    private String[] names;

    public SelectionSort(int[] patients, String[] names) {
        this.patients = patients;
        this.names = names;
    }

    public void sort() {

        int minIndex, auxInt;
        String auxStr;

        for (int i = 0; i < this.patients.length; i++) {

            minIndex = i;

            for (int j = 0; j < this.patients.length; j++) {
                if (this.patients[j] < this.patients[minIndex]) {
                    minIndex = j;
                }

            }

            auxInt = this.patients[i];
            this.patients[i] = this.patients[minIndex];
            this.patients[minIndex] = auxInt;

        }

    }

    public int[] getPatients() {
        return patients;
    }

    public void setPatients(int[] patients) {
        this.patients = patients;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

}
