package Tarea4.Programa11;

public class ControladorSeres {
    public void mostrarDatos() {
        Planta planta = new Planta();
        planta.comer();
        Animal animal = new Animal();
        animal.comer();
        AnimalCarnívoro anicarn = new AnimalCarnívoro();
        anicarn.comer();
        AnimalHerbívoro aniherv = new AnimalHerbívoro();
        aniherv.comer();
    }
}
