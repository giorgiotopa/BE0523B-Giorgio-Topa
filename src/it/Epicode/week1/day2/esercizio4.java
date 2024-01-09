package it.Epicode.week1.day2;

import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numeroInserito = scanner.nextInt();

        System.out.println("Conto alla rovescia:");

        // Utilizza un ciclo for per contare alla rovescia da numeroInserito a 0
        for (int i = numeroInserito; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
