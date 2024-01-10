package it.Epicode.week1.day3;


import java.util.ArrayList;
public class Sim {
    private String numeroTelefono;
    private double costoPerMinuto;
    private double creditoDisponibile;
    private ArrayList<String> ultimeChiamate;

    // Costruttore
    public Sim(String numeroTelefono, double costoPerMinuto){
        this.numeroTelefono = numeroTelefono;
        this.costoPerMinuto = costoPerMinuto;
        this.creditoDisponibile = 0;
        this.ultimeChiamate = new ArrayList<>();
    }

    //Funzione per la stampa dei dati della Sim
    public void stampaDatiSim(){
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Costo per minuto: " + costoPerMinuto + "€");
        System.out.println("Credito disponibile: " + creditoDisponibile + "€");

        System.out.println("Ultime 5 chiamate: ");
        for (String chiamata : ultimeChiamate){
            System.out.println(chiamata);
        }
    }

    //Metodi getter e setter

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }
    public void setCreditoDisponibile(double nuovoCredito) {
        this.creditoDisponibile = nuovoCredito;
    }

    public String getNumeroTelefono(){
        return numeroTelefono;
    }

    // Metodo per effettuare una telefonata
    public boolean telefonata(int minutiDiConversazione, String numeroChiamato){
        double costoChiamata = costoPerMinuto * minutiDiConversazione;

        if (creditoDisponibile >= costoChiamata){
            creditoDisponibile-= costoChiamata;

            String dettagliChiamata = "Durata: " + minutiDiConversazione + " minuti, Numero chiamato: " + numeroChiamato;
            ultimeChiamate.add(dettagliChiamata);

            return true;// Chiamata effettuata
        }else{
            return false;// Credito insufficiente
        }
    }

    public static void main(String[] args) {
        //Creazione di un'istanza di Sim
        Sim sim = new Sim("123456789", 0.30);

        //Ricarica Sim
        sim.setCreditoDisponibile(50);

        //Stampa dei dati iniziali Sim
        System.out.println("Dati iniziali della Sim:");
        sim.stampaDatiSim();

        //Effettua alcune telefonate
        boolean successoChiamata1 = sim.telefonata(120, "987654321");
        boolean successoChiamata2 = sim.telefonata(90,"555555555");

        //Stampa dei dati dopo le telefonate
        System.out.println("\nDati della Sim dopo le telefonate: ");
        sim.stampaDatiSim();

        //Verifica se le chiamate sono andate a buon fine
        System.out.println("\nEsito telefonata 1: " + (successoChiamata1 ? "La chiamata è stata effettuata" : "Credito insufficiente"));
        System.out.println("\nEsito telefonata 1: " + (successoChiamata2 ? "La chiamata è stata effettuata" : "Credito insufficiente"));
    }
}
