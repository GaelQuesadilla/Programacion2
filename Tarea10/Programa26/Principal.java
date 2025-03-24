package Tarea10.Programa26;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Hecto
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(
                "Equipo 7 \nElaborado por: \nHector Desiderio Erasto \nGael Gonzalez Mendez \nFrida Alejandra Mendoza Martinez");
        System.out.println("Programa 26");
        System.out.println("Refistra 10 numeros y busca un numero con metodo busqueda secuencial\n");

        Scanner vista = new Scanner(System.in);

        int[] vector = new int[10];
        Operacion ope = new Operacion();

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero: " + (i + 1) + ": ");

            vector[i] = vista.nextInt();
        }

        System.out.println("\nIngrese el numero a buscar: ");
        int num = vista.nextInt();

        ope.buscar(vector, num);

    }

}
