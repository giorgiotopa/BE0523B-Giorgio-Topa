package it.Epicode.week1.day4;

public class Dipendente {
    //Attributo statico
    static double stipendioBase = 1000;

    //Attributi non modificabili esternamente
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;
    //Enumerazione Livello
    public enum Livello{
        OPERAIO,IMPIEGATO,QUADRO,DIRIGENTE
    }
    //Enumerazione Dipartimento
    public enum Dipartimento{
        PRODUZIONE,AMMINISTRAZIONE,VENDITE
    }

    //Costruttori
    public Dipendente(String matricola, Dipartimento dipartimento){
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }
    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }


    //Metodi Get e Set
    public double getStipendioBase() {
        return stipendioBase;
    }
    public String getMatricola() {
        return matricola;
    }
    public double getStipendio() {
        return stipendio;
    }
    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }
    public Dipartimento getDipartimento() {
        return dipartimento;
    }
    public Livello getLivello() {
        return livello;
    }
    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    //Altri Metodi
    public void stampaDatiDipendente(Dipendente dipendente){
        System.out.println("Matricola: " + dipendente.matricola + "\nStipendio: " + dipendente.stipendio + "\nImporto Orario Straordinario: " + dipendente.importoOrarioStraordinario + "\nLivello: " + dipendente.livello + "\nDipartimento: " + dipendente.dipartimento);
    }
    public Livello promuovi(){
        switch (livello){
            case OPERAIO:
                livello = livello.IMPIEGATO;
                stipendio = Dipendente.stipendioBase * 1.2;
                break;
            case IMPIEGATO:
                livello = livello.QUADRO;
                stipendio = Dipendente.stipendioBase * 1.5;
                break;
            case QUADRO:
                livello = livello.DIRIGENTE;
                stipendio = Dipendente.stipendioBase *2;
                break;
            case DIRIGENTE:
                System.out.println("Errore, il dipendente ha già raggiunto la massima promozione possibile");
        }
        return livello;
    }

    public static double calcolaPaga(Dipendente dipendente){
        return dipendente.stipendio;
    }
    public static double calcolaPaga(Dipendente dipendente, int oreStraordinario){
        return dipendente.stipendio + (dipendente.importoOrarioStraordinario * oreStraordinario);
    }
}
