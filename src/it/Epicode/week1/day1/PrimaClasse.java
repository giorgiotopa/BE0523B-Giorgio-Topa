package it.Epicode.week1.day1;

import java.util.Scanner;

public class PrimaClasse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi un numero");

        int j = scanner.nextInt();

        System.out.println(j);

        scanner.nextLine();

        System.out.println("Dammi una parola");

        String parola = scanner.nextLine();



        System.out.println(parola);
    }
}
