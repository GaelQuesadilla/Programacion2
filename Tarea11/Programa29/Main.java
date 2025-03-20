package Tarea11.Programa29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal(new Scanner(System.in));
        Array array = new Array();
        Day[] days = new Day[15];

        int[] inputs = new int[] { 5, 18, 45, 38, 30, 11, 29, 20, 15, 10, 5, 0, -10, 8, 28 };

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto");

        terminal.Print(
                "Registra las temperaturas de 15 días para después, mediante búsqueda binaria buscar el día en el que sucedió el registro con determinada temperatura");

        for (int i = 0; i < days.length; i++) {
            int temperature = inputs[i];
            // int temperature = terminal.requestInt("Ingresa la temperatura del día " + (i
            // + 1));
            days[i] = new Day(i + 1, temperature);
        }

        array.setArray(days);
        array.sort();
        int option = 1;

        while (true) {
            if (option == 2) {
                break;
            }

            int target = terminal.requestInt("Ingresa la temperatura del día a buscar");
            int index = array.binarySearch(target);
            if (index == -1) {
                terminal.Print("El elemento no se encuentra");
            } else {
                Day currentDay = array.getArray()[index];

                terminal.Print(
                        String.format(
                                "El día con la temperatura %s es el día %s de marzo",
                                target,
                                currentDay.getNumber()));

            }
            option = terminal.requestInt("buscar otro numero?...\t(1:Si\t2:No)");
        }

        terminal.close();
    }

}
