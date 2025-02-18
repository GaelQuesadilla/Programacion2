package Tarea3.Programa10;

public class Team {
    private double points;
    private String name;

    public Team() {
    }

    public Team(double points, String name) {
        this.points = points;
        this.name = name;
    }

    public void change(double points) {
        this.points = points;
    }

    public void change(String name) {
        this.name = name;
    }

    public void change(String name, double points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        String info = "Nombre del equipo: %s\nPuntos:%s";
        return String.format(info, this.name, this.points);
    }

    public double getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }
}
