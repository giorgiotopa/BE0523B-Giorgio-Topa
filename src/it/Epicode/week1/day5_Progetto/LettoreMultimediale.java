package it.Epicode.week1.day5_Progetto;

import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elemento = new ElementoMultimediale[5];

        System.out.println("Aggiungi 5 file Multimediali");

        //Ciclo per l'aggiunta degli elementi
        for (int i = 0; i < 5; i++) {

            System.out.println("Inserisci il Titolo del file numero: " + (i + 1));
            String titolo = scanner.nextLine();

            System.out.println("Scegli il tipo di file: Inserisci 1 per Audio, 2 per Video e 3 per Immagine): ");
            int tipoElemento = scanner.nextInt();
            scanner.nextLine();

            //Switch che controlla la tipologia dell'elemento da inserire e lo istanzia in base alla stessa
            switch (tipoElemento) {
                case 1:
                    System.out.println("Volume: (Inserisci un numero intero per assegnare un valore al volume)");
                    int volume = scanner.nextInt();
                    scanner.nextLine();
                    elemento[i] = new Audio(titolo,volume);
                    break;
                case 2:
                    System.out.println("Volume: (Inserisci un numero intero per assegnare un valore al volume)");
                    int videoVolume = scanner.nextInt();
                    System.out.println("Luminosita: (Inserisci un numero intero per assegnare un valore alla luminosità)");
                    int luminosita = scanner.nextInt();
                    scanner.nextLine();
                    elemento[i] = new Video(titolo,videoVolume, luminosita);
                    break;
                case 3:
                    System.out.println("Luminosita: (Inserisci un numero intero per assegnare un valore alla luminosità)");
                    int immagineLuminosita = scanner.nextInt();
                    scanner.nextLine();
                    elemento[i] = new Immagine(titolo, immagineLuminosita);
                    break;
                default:
                    System.out.println("Tipo di file non valido. Riprova.");
                    i--; // Per permettere all'utente di reinserire i dati
                    break;
            }
        }
        int scelta;
        do {
            System.out.println("Scegli quale file riprodurre (Inserisci un numero da 1 a 5 per selezionare il file, 0 per chiudere il programma): ");
            scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elementoScelto = elemento[scelta - 1];

                if (elementoScelto instanceof Immagine) {
                    ((Immagine) elementoScelto).show();
                } else if (elementoScelto instanceof Riproducibile) {
                    ((Riproducibile) elementoScelto).play();
                } else {
                    System.out.println("Tipo di elemento non riconosciuto.");
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);

        System.out.println("Programma terminato. Arrivederci!");
        scanner.close();
        }
    }

