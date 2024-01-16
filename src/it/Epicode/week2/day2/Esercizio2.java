package it.Epicode.week2.day2;


import java.util.*;

public class Esercizio2 {
    //Funzione per generare una lista ordinata di N interi casuali da 0 a 100
    public static List<Integer> generaListaCasuale(int N){
        List<Integer> listaCasuale = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
           listaCasuale.add(random.nextInt(101));
        }

        Collections.sort(listaCasuale); //Ordina La lista
        return listaCasuale;
    }

    //Funzione per creare una nuova lista con elementi disposti in ordine inverso
    public static List<Integer> listaInversa(List<Integer> inputLista){
        List<Integer> listaInversa = new ArrayList<>(inputLista);
        Collections.reverse(listaInversa);
        inputLista.addAll(listaInversa);
        return inputLista;
    }

    //Funzione per stampare valori in posizioni pari o dispari in base al booleano
    public static void stampaPosizioni(List<Integer> inputLista, boolean pari){
        for (int i = pari ? 0 : 1; i < inputLista.size() ; i += 2) {
            System.out.print(inputLista.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero N");
        int N = scanner.nextInt();

        List<Integer> listaCasuale = generaListaCasuale(N);

        System.out.println("Lista casuale ordinata: " + listaCasuale);

        List<Integer> listaConListaInversa = listaInversa(new ArrayList<>(listaCasuale));
        System.out.println("Lista con elementi iniziali seguiti dal loro inverso: " + listaConListaInversa);

        System.out.println("Stampa valori in posizioni pari: ");
        stampaPosizioni(listaConListaInversa, true);
        System.out.println();

        System.out.println("Stampa valori in posizioni dispari: ");
        stampaPosizioni(listaConListaInversa, false);
    }
}
