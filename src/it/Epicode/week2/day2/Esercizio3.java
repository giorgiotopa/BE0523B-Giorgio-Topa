package it.Epicode.week2.day2;

import java.util.HashMap;
import java.util.Map;

public class Esercizio3 {
    private Map<String, String> rubrica; //Mappa per memorizzare i contatti (Nome, Telefono)

    public Esercizio3(){
        this.rubrica = new HashMap<>();
    }

    //Metodo per l'inserimento di una coppia <Nome, Telefono>
    public void inserisciContatto(String nome, String telefono){
        rubrica.put(nome, telefono);
    }

    //Metodo per la cancellazione di una coppia <Nome, Telefono> partendo dasl nome
    public void cancellaContatto(String nome){
        rubrica.remove(nome);
    }

    //Metodo per la ricerca di una Persona di cui si conosce il numero di telefono
    public String cercaPersonaPerTelefono(String telefono){
        for(Map.Entry<String, String> entry : rubrica.entrySet()){
            if (entry.getValue().equals(telefono)) {
                return entry.getKey(); // Restituisce il nome della persona
            }
        }
        System.out.println("Il numero di telefono non è presente");
        return null; //Restituisce null se il numero di telefono non è presente
    }

    //Metodo per la ricerca del numero di telefono di una Persona di cui si conosce il nome
    public String cercaTelefonoPerPersona(String nome){
        return rubrica.get(nome); // Restituisce il numero di telefono o null se il nome non è presente
    }

    //Metodo per la stampa di tutti i contatti con nome e numero
    public void stampaRubrica(){
        System.out.println("Rubrica Telefonica:");
        for (Map.Entry<String, String> entry : rubrica.entrySet()){
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }

    //Main
    public static void main(String[] args) {
        Esercizio3 rubrica = new Esercizio3();

        //Inserimento di contatti
        rubrica.inserisciContatto("Mario", "123456789");
        rubrica.inserisciContatto("Luigi", "987654321");

        //Stampa della rubrica
        rubrica.stampaRubrica();

        //Ricerca del numero di telefono di una persona
        String numeroLuigi = rubrica.cercaTelefonoPerPersona("Luigi");
        System.out.println("Il numero di Luigi è: " + numeroLuigi);

        //Ricerca di una persona a partire dal numero di telefono
        String nomeMario = rubrica.cercaPersonaPerTelefono("123456789");
        System.out.println("Il nome associato al numero 123456789 è: " + nomeMario);

        //Cancellazione di un contatto
        rubrica.cancellaContatto("Mario");

        //Ristampa Rubrica
        rubrica.stampaRubrica();
    }
}
