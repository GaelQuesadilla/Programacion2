package Tarea3.Programa10;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Team team;
        String newName;
        double newPoints;

        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael Gonzalez Mendez");

        terminal.Print("Registro y cambio de atributos de la clase Teams (Equipos) mediante la sobrecarga de métodos");

        terminal.Print("-> Uso de constructor");
        newName = terminal.requestString("Ingresa el nombre del equipo");
        newPoints = terminal.requestDouble("Ingresa la cantidad de puntos del equipo");
        team = new Team(newPoints, newName);
        terminal.Print(team.toString());

        terminal.Print("-> Cambio de nombre");
        newName = terminal.requestString("Ingresa el nuevo nombre del equipo");
        team.change(newName);
        terminal.Print(team.toString());

        terminal.Print("-> Cambio de puntos");
        newPoints = terminal.requestDouble("Ingresa el nuevo puntaje del equipo");
        team.change(newPoints);
        terminal.Print(team.toString());
        ;

    }
}
