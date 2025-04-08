package Tarea13.Programa35;

import java.util.Scanner;

public class Terminal {
    Scanner scanner;

    public Terminal(Scanner scanner) {
        this.scanner = scanner;
    }

    public void clearLine() {
        scanner.nextLine();
    }

    public String requestString(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        String value = scanner.nextLine();

        return value;
    }

    public Double requestDouble(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        Double value = scanner.nextDouble();

        return value;
    }

    public int requestInt(String message) {
        System.out.printf("\u001B[33m%s\u001B[0m\n", message);
        int value = scanner.nextInt();

        return value;
    }

    public Dog requestDog() {
        String name = this.requestString("Ingresa el nombre del perro");
        String race = this.requestString("Ingresa la raza del perro");
        int age = this.requestInt("Ingresa la edad del perro ( en años )");

        return new Dog(name, race, age);
    }

    public void Print(String message) {
        System.out.println(message);
    }

    public void Print(int message) {
        System.out.println(message);
    }

    public void Print(Dog message) {
        System.out.println(message.toString());
    }

    public void Print(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s -> ", array[i]);
        }
        System.out.println("null");
    }

    public void PrintMenu() {
        System.out.println("\t\tMenu");

        System.out.println("\u001B[35m|\tOpcion\t|\tAcción\t\t|\u001B[0m");
        System.out.println("|\t1\t|\tPush\t\t|");
        System.out.println("|\t2\t|\tPop\t\t|");
        System.out.println("|\t3\t|\tMostrar tope\t|");
        System.out.println("|\t4\t|\tMostrar pila\t|");
        System.out.println("|\t5\t|\tSalir\t\t|");
    }

    public void close() {
        this.scanner.close();
    }

}
