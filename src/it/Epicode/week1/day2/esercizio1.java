package it.Epicode.week1.day2;

import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String inputString = scanner.nextLine();

        boolean isPari = controllaPariDispari(inputString);
        if (isPari) {
            System.out.println("Il numero di caratteri è pari.");
        } else {
            System.out.println("Il numero di caratteri è dispari.");
        }

        System.out.println("Inserisci i l'anno per scopripre se è bisestile");
         int anno = scanner.nextInt();

         boolean isBisestile = annoBisestile(anno);

         if (isBisestile){
             System.out.println("L'anno inserito è bisestile");
         } else {
             System.out.println("L'anno inserito non è bisestile");
         }

    }
    public static boolean controllaPariDispari(String input) {
        int lunghezza = input.length();
        return lunghezza % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {

        if (anno % 4 == 0) {
            return true;
            }
        else if(anno % 100 == 0 && anno % 400 == 0){
            return true;
            }
        else {
            return false;
        }
    }
}
