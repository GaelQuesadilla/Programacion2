package Tarea04.Programa13;

import java.util.Scanner;

public class Rectangulo extends Figura {
    private double base, altura;

    public void preguntarDatos(Scanner scanner) {
        System.out.println("Ingresa el valor de la base del rectángulo:");
        base = scanner.nextDouble();
        System.out.println("Ingresa el valor de la altura del rectángulo:");
        altura = scanner.nextDouble();
        setNombre("Rectángulo");
    }

    @Override
    public void calculaArea() {
        setArea(base * altura);
    }

    public void calculaPerimetro() {
        setPerimetro(2 * (base + altura));
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
