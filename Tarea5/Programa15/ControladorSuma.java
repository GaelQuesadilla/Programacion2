package Tarea5.Programa15;

import java.util.Scanner;

public class ControladorSuma {
    public static void main(String[] args) {

        Scanner hyuka = new Scanner(System.in);
        System.out.println("Ingresa el valor de tu multiplicando (el número que quieres multiplicar):");
        int multiplicando = hyuka.nextInt();
        System.out.println(
                "Ingresa el valor de tu multiplicador (el número de veces que quieres multiplicar ese número):");
        int multiplicador = hyuka.nextInt();

        ModeloSuma modeloSuma = new ModeloSuma();
        modeloSuma.setMultiplicador(multiplicador);
        modeloSuma.setMultiplicando(multiplicando);
        modeloSuma.calcularMultiplicacion();

        System.out.println("El resultado de la multiplicación es: " + modeloSuma.getRes());

        hyuka.close();
    }
}
