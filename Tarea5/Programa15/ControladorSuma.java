package Tarea5.Programa15;

import java.util.Scanner;

public class ControladorSuma {
    public static void main(String[] args) {
        VistaSuma pant = new VistaSuma();

        pant.escribirM(
                "Elaborado por: Frida Alejandra Mendoza Martínez, \nGael González Méndez y Héctor Desiderio Erasto.");
        pant.escribirM("Equipo 07, Programación 2.");
        pant.escribirM(
                "Funcionalidad: Programa que calcula y muestra la multiplicación de dos números usando sumas sucesivas.");

        Scanner hyuka = new Scanner(System.in);
        pant.escribirM("Ingresa el valor de tu multiplicando (el número que quieres multiplicar):");
        int multiplicando = hyuka.nextInt();
        pant.escribirM("Ingresa el valor de tu multiplicador (el número de veces que quieres multiplicar ese número):");
        int multiplicador = hyuka.nextInt();

        ModeloSuma modeloSuma = new ModeloSuma();
        modeloSuma.setMultiplicador(multiplicador);
        modeloSuma.setMultiplicando(multiplicando);
        modeloSuma.calcularMultiplicacion();

        pant.escribirM("El resultado de la multiplicación es: " + modeloSuma.getRes());

        hyuka.close();
    }
}
