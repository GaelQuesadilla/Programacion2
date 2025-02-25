package Tarea4.Programa13;

import java.util.Scanner;

public class Controlador {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarDatos() {
        Circulo circulo = new Circulo();
        circulo.preguntarDatos(scanner);
        circulo.calculaArea();
        circulo.calculaPerimetro();
        imprimirResultados(circulo);

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.preguntarDatos(scanner);
        rectangulo.calculaArea();
        rectangulo.calculaPerimetro();
        imprimirResultados(rectangulo);
    }

    private void imprimirResultados(Figura figura) {
        System.out.println("\n" + figura.getNombre() + ":");
        System.out.println("Área: " + figura.getArea());
        System.out.println("Perímetro: " + figura.getPerimetro());
    }
}
