package it.Epicode.week2.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    private static final Logger logger = LoggerFactory.getLogger("log");

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];

        //Inizializzazione dell'array con valori casuali
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10) + 1;
        }

        while (true){
            System.out.println("Array corrente: " + Arrays.toString(array));
            System.out.println("Inserisci un numero da inserire nell'array (0 per uscire)");

            try{
                int numero = scanner.nextInt();

                if (numero == 0){
                    break;
                }

                System.out.println("Inserisci la posizione: (1 - 5)");
                int posizione = scanner.nextInt();

                if (posizione < 1 || posizione > array.length){
                    logger.error("Posizione non valida: Il valore inserito deve essere conmpreso tra 1 e 5");
                    continue;
                }
                array[posizione - 1] = numero;
            } catch (InputMismatchException e){
                logger.error("Inserire un numero valido.");
                scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException e){
                logger.error("Errore nell'accesso all'array. Posizione non valida");
            }
        }

        System.out.println("Programma Terminato. Arrivederci!");
    }
}
