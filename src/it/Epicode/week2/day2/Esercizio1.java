package it.Epicode.week2.day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Chiedi all'utente di inserire un numero intero N
        System.out.println("Inserisci un numero intero");
        int N = scanner.nextInt();

        //Utilizza un HashSet per memorizzare le parole distinte
        Set<String> paroleDistinte = new HashSet<>();

        //Utilizza un HashSet per memorizzare le parole duplicate
        Set<String> paroleDuplicate = new HashSet<>();

        //Chiedi all'utente di inserire N parole
        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci la parola #" + (i + 1) + ": ");
            String parola = scanner.next();

            //Verifica se la parola è già presente nel set di parole
            if (!paroleDistinte.add(parola)){
                //La parola è duplicata, aggiungila al set delle parole
                paroleDuplicate.add(parola);
            }
        }

        //Stampa le parole duplicate
        System.out.println("Parole duplicate: " + paroleDuplicate);
        //Stampa il numero di parole distinte
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());
        //Stampa l'elenco delle parole distinte
        System.out.println("Elenco delle parole distinte: " + paroleDistinte);

        scanner.close();
    }
}
