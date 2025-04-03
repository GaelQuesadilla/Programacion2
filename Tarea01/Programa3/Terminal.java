package Tarea01.Programa3;

import java.util.Scanner;

public class Terminal {

    public int getVote(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int value = scanner.nextInt();
        return value;
    }

    public void Print(String message) {
        System.out.println(message);
    }

}
