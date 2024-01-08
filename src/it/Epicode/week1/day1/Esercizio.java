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


        System.out.println("Inserisci la dimensione di un lato del triangolo");
        double latoTriangolo1 = scanner.nextDouble();

        System.out.println("Inserisci la dimensione di un altro lato del triangolo");
        double latoTriangolo2 = scanner.nextDouble();

        System.out.println("Inserisci la dimensione di un altro lato del triangolo");
        double latoTriangolo3 = scanner.nextDouble();

        double areaTriangolo = areaTriangolo(latoTriangolo1,latoTriangolo2,latoTriangolo3);

        System.out.println("L'area del triangolo è: " + areaTriangolo);

    }
    public static double perimetroRettangolo(double x, double y) {

        double perimetro = 2 * (x + y);

        return perimetro;
    }

    public static int pariDispari(int x) {

         x = x%2;

        return x;
    }

    public static double areaTriangolo(double x, double y, double z) {

        double semiperimetro = (x + y + z) / 2;

        double area = Math.sqrt(semiperimetro * (semiperimetro - x) * (semiperimetro - y) * (semiperimetro - z));

        return area;
    }

}
