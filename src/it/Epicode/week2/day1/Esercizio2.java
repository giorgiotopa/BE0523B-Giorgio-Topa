package it.Epicode.week2.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


public class Esercizio2 {
    private static final Logger logger = LoggerFactory.getLogger("log");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Inserisci il numero di Km percorsi:");
            double kmPercorsi = scanner.nextDouble();

            System.out.println("Inserisci i litri di carburante consumati");
            double litriConsumati = scanner.nextDouble();

            if(litriConsumati == 0){
                throw new ArithmeticException("Il numero di litri consumati non può essere 0");
            }

            double kmPerLitro = kmPercorsi/litriConsumati;
            System.out.println("Il numero di km per litro percorsi è : " + kmPerLitro);
        } catch (Exception e){
            logger.error("Errore durante l'esecuzione del programma: {}", e.getMessage());
        }finally {
            scanner.close();
        }
    }

}
