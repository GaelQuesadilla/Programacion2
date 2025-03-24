package Tarea1.Programa3;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Votes votes = new Votes();
        int total = 7;
        int current;

        terminal.Print("Programa que registra los votos y calcula cuantos están por debajo del 20%");

        terminal.Print("Elaborado por el equipo 7.");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto\n\n");

        for (int i = 0; i <= total - 1; i++) {
            current = terminal.getVote("Ingresa el voto No." + (i + 1));
            votes.addVote(current);
        }

        terminal.Print(votes.getVotesOnTop20P() + " partidos de " + total + " tienen  el 20% de los votos o más");

    }

}
