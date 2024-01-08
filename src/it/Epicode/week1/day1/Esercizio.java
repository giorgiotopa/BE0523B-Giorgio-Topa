package it.Epicode.week1.day1;

import java.util.Scanner;

public class Esercizio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la dimensione di un lato del rettangolo");
        double lato1 = scanner.nextDouble();

        System.out.println("Inserisci la dimensione dell' altro lato del rettangolo");
        double lato2 = scanner.nextDouble();

        double risultatoPerimetro = perimetroRettangolo(lato1, lato2);

        System.out.println("Il perimetro del rettangolo è: " + risultatoPerimetro);

        System.out.println("Inserisci un numero");

        int numeroVerifica = scanner.nextInt();

        int risultatoVerifica = pariDispari(numeroVerifica);

        System.out.println("Il risultato della verifica è: " + risultatoVerifica);
    }
    public static double perimetroRettangolo(double x, double y) {

        double perimetro = 2 * (x + y);

        return perimetro;
    }

    public static int pariDispari(int x) {

         x = x%2;

        return x;
    }

}
