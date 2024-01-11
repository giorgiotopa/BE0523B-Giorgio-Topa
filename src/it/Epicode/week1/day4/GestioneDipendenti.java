package it.Epicode.week1.day4;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente operaio1 = new Dipendente("001", Dipendente.Dipartimento.PRODUZIONE);
        Dipendente operaio2 = new Dipendente("002", Dipendente.Dipartimento.PRODUZIONE);
        Dipendente impiegato1 = new Dipendente("003",1200,35, Dipendente.Livello.IMPIEGATO,Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente dirigente1 = new Dipendente("004",2000,45, Dipendente.Livello.DIRIGENTE, Dipendente.Dipartimento.VENDITE);


        //Promozioni
        operaio1.promuovi();
        impiegato1.promuovi();

        //Stampa Stato Dipendenti
        System.out.println("Stampa Stato Dipendenti");
        System.out.println();
        operaio1.stampaDatiDipendente();
        System.out.println();
        operaio2.stampaDatiDipendente();
        System.out.println();
        impiegato1.stampaDatiDipendente();
        System.out.println();
        dirigente1.stampaDatiDipendente();
        System.out.println();

        //Calcola Stipendi
        double totaleStipendi;
        double stipendio1 = operaio1.calcolaPaga(operaio1,5);
        double stipendio2 = operaio2.calcolaPaga(operaio2,5);
        double stipendio3 = impiegato1.calcolaPaga(impiegato1,5);
        double stipendio4 = dirigente1.calcolaPaga(dirigente1,5);
        totaleStipendi = stipendio1 + stipendio2 + stipendio3 + stipendio4;

        System.out.println("Il totale degli stipendi è: " + totaleStipendi + "€");

    }

  }
