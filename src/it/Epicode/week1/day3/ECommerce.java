package it.Epicode.week1.day3;

import java.util.Date;
import java.util.ArrayList;

public class ECommerce {
    public static class Articolo{
        private int codiceArticolo;
        private String descrizione;
        private double prezzo;
        private int pezziDisponibili;

        public Articolo(int codiceArticolo, String descrizione, double prezzo, int pezziDisponibili){
            this.codiceArticolo = codiceArticolo;
            this.descrizione = descrizione;
            this.prezzo = prezzo;
            this.pezziDisponibili = pezziDisponibili;
        }

        public int getCodiceArticolo() {
            return codiceArticolo;
        }

        public String getDescrizione() {
            return descrizione;
        }

        public double getPrezzo() {
            return prezzo;
        }

        public int getPezziDisponibili() {
            return pezziDisponibili;
        }
    }

    public static class Cliente{
        private int codiceCliente;
        private String nomeCognome;
        private String email;
        private Date dataIscrizione;

        public Cliente(int codiceCliente, String nomeCognome, String email, Date dataIscrizione){
            this.codiceCliente = codiceCliente;
            this.nomeCognome = nomeCognome;
            this.email = email;
            this.dataIscrizione = dataIscrizione;
        }

        public int getCodiceCliente() {
            return codiceCliente;
        }

        public String getNomeCognome() {
            return nomeCognome;
        }

        public String getEmail() {
            return email;
        }

        public Date getDataIscrizione() {
            return dataIscrizione;
        }
    }

    public static class Carrello {
        private Cliente cliente;
        private ArrayList<Articolo> elencoArticoli;
        private double totaleCostoArticoli;

        public Carrello(Cliente cliente) {
            this.cliente = cliente;
            this.elencoArticoli = new ArrayList<>();
            this.totaleCostoArticoli = 0.0;
        }

        public void aggiungiArticolo(Articolo articolo, int quantità) {
            if (articolo.getPezziDisponibili() >= quantità) {
                elencoArticoli.add(articolo);
                totaleCostoArticoli += articolo.getPrezzo() * quantità;
                articolo.pezziDisponibili -= quantità;
                System.out.println("Articolo aggiunto al carrello");
            } else {
                System.out.println("Quantità richiesta non disponibile in magazzino");
            }
        }

        public void visualizzaCarrello() {
            System.out.println("Carrello di " + cliente.getNomeCognome() + ":");
            for (Articolo articolo : elencoArticoli) {
                System.out.println("Codice: " + articolo.getCodiceArticolo() +
                        ", Descrizione: " + articolo.getDescrizione() +
                        ", Prezzo: " + articolo.getPrezzo());
//                      +  ", Quantità: 1");
            }
            System.out.println("Totale costo articoli: " + totaleCostoArticoli + " euro");
        }
    }

        public static void main(String[] args) {
            //Creazione Cliente
            Cliente cliente = new Cliente(1,"Mario Rossi","mario@example.it", new Date());

            //Creazione di alcuni articoli
            Articolo articolo1 = new Articolo(101,"Laptop",799.99,10);
            Articolo articolo2 = new Articolo(102,"Smartphone",399.99,15);

            //Creazione di un carrello associato al cliente
            Carrello carrello = new Carrello(cliente);

            //Aggiunta di articoli al carrello
            carrello.aggiungiArticolo(articolo1,1);
            carrello.aggiungiArticolo(articolo2,2);

            //Visualizzazione del carrello
            carrello.visualizzaCarrello();

        }
}
