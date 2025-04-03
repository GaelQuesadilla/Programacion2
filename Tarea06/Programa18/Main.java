package Tarea06.Programa18;

public class Main {
    public static void main(String[] args) {
        int total = 5;

        Terminal terminal = new Terminal();
        SelectionSort selectionSort = new SelectionSort();
        String[] names = new String[total];
        int[] patients = new int[total];

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto");

        terminal.Print(
                "Registra dos vectores (pacientes: int[] & nombre del doctor: String[]) y los ordena de acuerdo al número de pacientes");

        for (int i = 0; i < total; i++) {

            names[i] = terminal.requestString("Ingresa el nombre del doctor no." + (i +
                    1));
            patients[i] = terminal.requestInt("Ingresa la cantidad de pacientes");

        }

        // Debug only
        // names = new String[] { "Oscar", "Gael", "Frida", "Hector", "Angel" };
        // patients = new int[] { 17, 15, 23, 2, 44 };

        selectionSort.setNames(names);
        selectionSort.setPatients(patients);

        terminal.Print("Doctores disponibles:");
        terminal.Print(selectionSort.getNames());
        terminal.Print("Cantidad de pacientes:");
        terminal.Print(selectionSort.getPatients());

        terminal.Print("\tOrdenando...");
        selectionSort.sort();

        terminal.Print("Doctores disponibles:");
        terminal.Print(selectionSort.getNames());
        terminal.Print("Cantidad de pacientes:");
        terminal.Print(selectionSort.getPatients());

        terminal.Print("El doctor con menos pacientes es: " + selectionSort.getNames()[0]);
        terminal.Print("El doctor con más pacientes es: " + selectionSort.getNames()[total - 1]);
    }

}
