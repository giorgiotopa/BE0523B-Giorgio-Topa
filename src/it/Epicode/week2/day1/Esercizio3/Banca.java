package it.Epicode.week2.day1.Esercizio3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Banca {
    private static final Logger LOGGER = LoggerFactory.getLogger("log");
    public static void main(String args[]) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(1750.5);

            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            LOGGER.error("Errore durante il prelievo: {}", e.getMessage());
            e.printStackTrace();
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

        conto2.stampaSaldo();

        try {
            conto2.preleva(1000);

            conto2.stampaSaldo();

        } catch (BancaException e) {
            LOGGER.error("Errore durante il prelievo: {}", e.getMessage());
            e.printStackTrace();
        }
    }

}
