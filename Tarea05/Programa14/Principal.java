/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea05.Programa14;

import java.util.Scanner;

/**
 *
 * @author Hecto
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println(
                "Elaborado por: \nHector Desiderio Erasto \nGael Gonzalez Mendez \nFrida Alejandra Mendoza Martinez");
        System.out.println("Programa 14");
        System.out.println("Uso de factorial recursivo");

        System.out.println("Ingrese un numero a calcular su factorial:");
        int numero = sca.nextInt();

        Fact obFactorial = new Fact(numero);
        obFactorial.setR(obFactorial.MFactorial(obFactorial.getNum()));

        System.out.println("El factorial de " + obFactorial.getNum() + " es " + obFactorial.getR());

    }

}
