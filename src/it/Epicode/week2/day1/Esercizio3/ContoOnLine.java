package it.Epicode.week2.day1.Esercizio3;

public class ContoOnLine extends ContoCorrente{
    double maxPrelievo;

    ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    void stampaSaldo() {

        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    void preleva(double x) throws BancaException {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }else {
            // Lancio dell'eccezione BancaException se il prelievo supera il massimo consentito
            throw new BancaException("Il prelievo non è disponibile");
        }
    }

}
