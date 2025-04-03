package Tarea04.Programa13;

import java.util.Scanner;

public class Circulo extends Figura {
    private double radio;

    public void preguntarDatos(Scanner scanner) {
        System.out.println("Ingresa el valor del radio del círculo:");
        radio = scanner.nextDouble();
        setNombre("Círculo");
    }

    @Override
    public void calculaArea() {
        setArea(Math.PI * (radio * radio));
    }

    public void calculaPerimetro() {
        setPerimetro(2 * Math.PI * radio);
    }

    public double getRadio() {
        return radio;
    }
}
