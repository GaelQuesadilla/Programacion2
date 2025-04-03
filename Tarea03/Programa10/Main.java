package Tarea03.Programa10;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Team team;
        String newName;
        double newPoints;
        int option;

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael Gonzalez Mendez");
        terminal.Print("Héctor Desiderio Erasto");

        terminal.Print("Registro y cambio de atributos de la clase Teams (Equipos) mediante la sobrecarga de métodos");

        terminal.Print("-> Uso de constructor: Equipo \"Lobos\", puntos: 7");
        team = new Team(7d, "Lobos");
        terminal.Print(team.toString());

        terminal.Print("---------------------");
        terminal.Print("\tOpciones");
        terminal.Print("---------------------");
        terminal.Print("(1) Cambiar nombre\n(2) Cambiar puntos\n(3) Cambiar nombre y puntos");

        option = terminal.requestInt("Ingresa la opción (1,2,3)");

        if (option == 1) {
            newName = terminal.requestString("Ingresa el nombre:");
            team.change(newName);
        } else if (option == 2) {

            newPoints = terminal.requestDouble("Ingresa los puntos:");
            team.change(newPoints);

        } else if (option == 3) {
            newName = terminal.requestString("Ingresa el nombre:");
            newPoints = terminal.requestDouble("Ingresa los puntos:");
            team.change(newName, newPoints);

        } else {
            terminal.Print("Error: Opción inválida");
            System.exit(0);
        }

        terminal.Print(team.toString());

    }
}
