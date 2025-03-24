package Tarea3.Programa8;

public class ControladorAnimal {
    public void escribirM(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarDatos() {
        Animal persona1 = new Persona();
        persona1.comer();
        Animal perro1 = new Perro();
        perro1.comer();
        Animal vaca1 = new Vaca();
        vaca1.comer();
        ;
    }
}
